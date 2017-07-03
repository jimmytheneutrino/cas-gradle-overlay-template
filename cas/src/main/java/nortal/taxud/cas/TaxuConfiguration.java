package nortal.taxud.cas;

import java.util.ArrayList;
import java.util.List;

import org.apereo.cas.services.RegexRegisteredService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaxuConfiguration {
	
	  @Bean
	  public List inMemoryRegisteredServices() {
		  System.out.println("!!!YAY!!!\n\n\n\n\n\n");
	      final List services = new ArrayList<>();
	      final RegexRegisteredService service = new RegexRegisteredService();
	      //services.add(service);
	      return services;
	  }

}
