package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyInsurancePolicy
{
	@Id
	@SequenceGenerator(name="plan_seq",sequenceName="PLAN_ID_SEQ",allocationSize=1)//ALLOCATIONSIZE should be equal to INCREMENT BY in Sequence query
	@GeneratedValue(generator="plan_seq",strategy=GenerationType.SEQUENCE)
	private Integer planId; 
	
	private String planName;
	
	private Integer planAmt;
	
	public MyInsurancePolicy(String planName,Integer planAmt)
	{
		this.planName=planName;
		this.planAmt=planAmt;
	}


}
