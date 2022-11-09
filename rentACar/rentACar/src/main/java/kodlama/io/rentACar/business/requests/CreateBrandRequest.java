package kodlama.io.rentACar.business.requests;

import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Request: istek
//response: cevap 
@Data
@AllArgsConstructor
@NoArgsConstructor
//kullanıcınnın girdiği yanıt ör:tc giriyoruz tel giriyoruz gibi...
public class CreateBrandRequest{
   private String name;
}
