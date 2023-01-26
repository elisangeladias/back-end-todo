package com.elis.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elis.todo.domain.Todo;
import com.elis.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDasos() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2023"), false);
		Todo t2 = new Todo(null, "Ler", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2023"), true);
		Todo t3 = new Todo(null, "Exercícios", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2023"), false);
		Todo t4 = new Todo(null, "Meditar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2023"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
