package cassianodess.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration

public class SwaggerConfiguration {

	  @Bean
	  public OpenAPI springShopOpenAPI() {
		  Contact contact = new Contact();
		  contact.name("Cassiano de Souza Santos");
		  contact.email("cassianodess@hotmail.com");
		  contact.setUrl("https://github.com/cassianodess");
	      return new OpenAPI()
	              .info(new Info().title("LOL DESIGN REST API")
	              .description("REST API SPECIFICATIONS")
	              .contact(contact)
	              .version("v1.0.0")
	              .license(new License().name("Apache 2.0").url("http://springdoc.org")));
	  }

}
