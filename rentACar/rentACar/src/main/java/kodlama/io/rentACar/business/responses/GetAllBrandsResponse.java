package kodlama.io.rentACar.business.responses;

import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse { 
	//son kullanıcıya vermek istediklerimiz
   private int id;
   private String name;
}
