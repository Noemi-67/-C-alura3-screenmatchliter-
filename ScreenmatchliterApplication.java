package com.litercuartointento.screenmatchliter;


import com.litercuartointento.screenmatchliter.principal.Principal;
import com.litercuartointento.screenmatchliter.repository.IAutoresRepository;

import com.litercuartointento.screenmatchliter.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchliterApplication implements CommandLineRunner {
	@Autowired
	private IAutoresRepository autoresRepositorio;
	@Autowired
	private ILibrosRepository librosRepositorio;
	public static void main(String[] args){SpringApplication.run(ScreenmatchliterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autoresRepositorio, librosRepositorio);
		principal.muestraElMenu();
	}
}
