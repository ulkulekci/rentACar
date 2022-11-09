package kodlama.io.rentACar.webApi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

      // api isimlendirmelerinde çoğul kullanılır "Brands" Controller erişim noktası
      //@RestController  sen bir restcontroller'sin demek burası erişim noktası annotation
      //ulaşmak için kontol merkezine, iletişim kurma
@RestController //annotation
@RequestMapping("/api/brands") //www.kodlama.io/api/brands iletişim kurma controller e ulaşma için
public class BrandsController {
	private BrandService brandService;

        //istek controllere yapılıyor uygun bulursa business'e gidiyor
		//business'da dataaccess'e  gidiyor
		//uygun datayı verebilirsin diyor oda veriyor 
	
	@Autowired //@Autowired git parametrelerine bak BrandService uygulamayı tara kim implemente ediyor bul 
	//brandmanager onun new'lenmiş halini bana ver 
	public BrandsController(BrandService brandService) { 
		this.brandService = brandService;
	}
	
	@GetMapping("/getall") //www.kodlama.io/api/brands böyle bir istek gelirse sen çalış
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
;
}
