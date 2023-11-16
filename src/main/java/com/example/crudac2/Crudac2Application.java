package com.example.crudac2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.crudac2.models.CategoriaCurso;
import com.example.crudac2.models.Curso;
import com.example.crudac2.repository.CategoriaRepository;
import com.example.crudac2.repository.CursoRepository;

@SpringBootApplication
public class Crudac2Application {

	public static void main(String[] args) {
		SpringApplication.run(Crudac2Application.class, args);
	}

	@Bean
	public CommandLineRunner init(@Autowired CategoriaRepository categoriaCursoRepository,
			@Autowired CursoRepository cursoRepository) {
		return args -> {

			// Criando categorias e cursos

			CategoriaCurso categoria1 = new CategoriaCurso(null, "Engenharia", null);
			CategoriaCurso categoria2 = new CategoriaCurso(null, "Humanas", null);
			CategoriaCurso categoria3 = new CategoriaCurso(null, "Saude", null);

			CategoriaCurso categoria1Encontrada = categoriaCursoRepository.findById(1L).get();
			CategoriaCurso categoria2Encontrada = categoriaCursoRepository.findById(2L).get();
			CategoriaCurso categoria3Encontrada = categoriaCursoRepository.findById(3L).get();

			Curso curso1 = new Curso(null, "Engenharia Mecanica", 200, categoria1Encontrada);
			Curso curso2 = new Curso(null, "Filosofia", 100, categoria2Encontrada);
			Curso curso3 = new Curso(null, "Enfermagem", 250, categoria3Encontrada);

			// Salvando categorias e cursos

			categoriaCursoRepository.save(categoria1);
			categoriaCursoRepository.save(categoria2);
			categoriaCursoRepository.save(categoria3);

			cursoRepository.save(curso1);
			cursoRepository.save(curso2);
			cursoRepository.save(curso3);

			// Adicionando em listas

			List<Curso> listaEng = new ArrayList<>();
			listaEng.add(curso1);

			List<Curso> listaHumanas = new ArrayList<>();
			listaHumanas.add(curso2);

			List<Curso> listaSaude = new ArrayList<>();
			listaSaude.add(curso3);

			categoria1Encontrada.setCursos(listaEng);
			categoria2Encontrada.setCursos(listaHumanas);
			categoria3Encontrada.setCursos(listaSaude);

			categoriaCursoRepository.save(categoria1Encontrada);
			categoriaCursoRepository.save(categoria2Encontrada);
			categoriaCursoRepository.save(categoria3Encontrada);
		};
	}

}
