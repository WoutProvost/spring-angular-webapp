package com.example.horeca;

// import com.example.horeca.domain.Horeca;
// import com.example.horeca.services.HorecaService;
// import java.io.IOException;
// import java.io.InputStream;
// import com.fasterxml.jackson.core.type.TypeReference;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// Deserialize JSON and store objects in database
	// @Bean
	// public CommandLineRunner initializeDatabase(HorecaService service) {
	// 	return args -> {
	// 		ObjectMapper mapper = new ObjectMapper();
	// 		TypeReference<Iterable<Horeca>> typeReference = new TypeReference<Iterable<Horeca>>(){};
	// 		InputStream inputStream = TypeReference.class.getResourceAsStream("/data.json");

	// 		try {
	// 			System.out.println("Saving data ...");

	// 			Iterable<Horeca> horeca = mapper.readValue(inputStream, typeReference);

	// 			for(Horeca h : horeca) {
	// 				service.save(h);
	// 			}

	// 			System.out.println("Data saved.");
	// 		} catch(IOException e) {
	// 			System.err.println("Unable to save data: " + e.getMessage());
	// 		}
	// 	};
	// }
}