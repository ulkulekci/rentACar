package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")//tablo olarak karşılık geldiği yer
@Data //getter setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın 
public class Brand {
	  
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY) //Id si otomotik artan
	  @Column(name="id")
	  private int id;
	  
	  @Column(name="name")
	  private String name;
	    
	}
//Brand-->id,name,quantity
//GetAllBrandsResponse-->id,name
//mapping