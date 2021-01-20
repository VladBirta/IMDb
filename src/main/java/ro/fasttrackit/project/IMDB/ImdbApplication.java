package ro.fasttrackit.project.IMDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.project.IMDB.model.Action;
import ro.fasttrackit.project.IMDB.repository.ActionRepository;

import java.util.List;

@SpringBootApplication
public class ImdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(ActionRepository repository){
		return args -> repository.saveAll(List.of(
				new Action("https://m.media-amazon.com/images/M/MV5BODgxNzkzZTgtYzlhZi00MTQ2LTkyNGUtZjRmZjQ0YzE0MmUzXkEyXkFqcGdeQXVyMTE2OTg4Mjg@._V1_UY268_CR3,0,182,268_AL_.jpg", "An ex-mercenary known for finding missing children is hired by a mixed...", "Six Bullets", 6.1),
				new Action("https://m.media-amazon.com/images/M/MV5BNTJmMGEzMTQtMzQzMi00YjE1LWI4MTctNjY0NWZiYzE2MDVhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg","Bloodsport follows Frank Dux, an American martial artist serving in the military, who decides to leave the army to compete in a martial arts tournament in Hong Kong where fights to the death can occur.","BloodSport", 6.8),
				new Action("https://m.media-amazon.com/images/M/MV5BMTY3OTg2OTM3OV5BMl5BanBnXkFtZTYwNzY5OTA3._V1_UX182_CR0,0,182,268_AL_.jpg", "Two disgraced FBI agents go way undercover in an effort to protect hotel heiresses the Wilson sisters from a kidnapping plot.\n", "White Chicks", 5.8)

		));
	}
}
