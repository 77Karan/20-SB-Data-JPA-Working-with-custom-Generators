package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.MyInsurancePolicy;
import in.ashokit.repository.InsuranceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		InsuranceRepository repo = context.getBean(InsuranceRepository.class);
		MyInsurancePolicy mp = new MyInsurancePolicy("Jeevan Bheem",40);
		MyInsurancePolicy mp1 = new MyInsurancePolicy("Saral Bheem",800);
		MyInsurancePolicy mp2 = new MyInsurancePolicy("ILFT",300);
		MyInsurancePolicy mp3 = new MyInsurancePolicy("LIC",1200);
		MyInsurancePolicy mp4 = new MyInsurancePolicy("Ujjeevan",500);
		MyInsurancePolicy mp5 = new MyInsurancePolicy("Manipur",400);
		MyInsurancePolicy mp6 = new MyInsurancePolicy("Muthoot",200);

		repo.save(mp);
		repo.save(mp1);
		repo.save(mp2);
		repo.save(mp3);
		repo.save(mp4);
		repo.save(mp5);
		repo.save(mp6);
	}

}
