package br.com.uniciv.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@SpringBootApplication
public class TestApiApplication {

	private final MessageRepository repository;

	@Autowired
	public TestApiApplication(MessageRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Message> getAll(){
		return repository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void post(@RequestBody Message message) {
		message.setId(UUID.randomUUID());
		repository.save(message);
	}

}


