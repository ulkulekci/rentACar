package kodlama.io.rentACar.business.abstracts;

import java.util.List;


import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandService {
    List<GetAllBrandsResponse> getAll(); //son kullanıcı bana dataları versene diyor istekte bulunuyor
                                         //bizim ona yanıtımız brand yani respons
    void add(CreateBrandRequest createBrandRequest);
}
