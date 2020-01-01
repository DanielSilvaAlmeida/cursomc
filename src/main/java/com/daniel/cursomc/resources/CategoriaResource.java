package com.daniel.cursomc.resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Anotação para aplicações REST
@RestController
// Mapeia o endponit
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	// Define que o méetodo terá a função de GET
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}
