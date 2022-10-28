package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //bu sınıf bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{ 
	
	List<Brand> brands; //globalda tanımladım getAll dediğim anda erişiliyor
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>(); //veri tabanı eklemedim inmemory çalışıyorum bunu kullanan için boş bir array oluşturdum uyduruktan marka listesi
		brands.add(new Brand(1, "BMV")); //veri tabanına eklemek yerine sanki veri tabanından geliyormuş gibi
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
	}

	public List<Brand> getAll() { //içinde markalar barındıran listeler döndürücem demek
		return brands;
		
	}
	
}
