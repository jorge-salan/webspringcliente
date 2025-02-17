package com.arquitecturajava.webcliente;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.arquitecturajava.webspring.dtos.PersonaDto;

@RestController
public class ClienteRestPersona {

	@RequestMapping("/personascliente")
	public List<PersonaDto> listarPersonas() {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<PersonaDto[]> response = restTemplate.getForEntity("http://springbootservidor:8083/personas",
				PersonaDto[].class);
		return Arrays.asList(response.getBody());

	}

}
