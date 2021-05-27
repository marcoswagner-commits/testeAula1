package br.edu.ufj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ufj.model.Aluno;
import br.edu.ufj.repository.AlunoDAO;

@SpringBootApplication
public class TesteAula1Application implements CommandLineRunner  {
	
	
	@Autowired
	AlunoDAO alunoDAO;

	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Aluno a1 = new Aluno(30,"Weuler","weuler@gmail.com");
		Aluno a2 = new Aluno(40,"Esdras","esdras@gmail.com");
		alunoDAO.save(a1);
		alunoDAO.save(a2);
		
		
	}
	
	

}
