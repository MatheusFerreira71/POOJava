package br.edu.fatecfranca.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import br.edu.fatecfranca.entities.Virus;
import br.edu.fatecfranca.repositories.VirusRepository;
@RestController
@RequestMapping("/api/virus")
public class VirusController {

	@Autowired
	VirusRepository injecao;
	
	@GetMapping
	public List<Virus> index () {
		return injecao.findAll();
	}
	
	@PostMapping
	public Virus create(@RequestBody Virus virus) {
		return injecao.save(virus);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete (@PathVariable String id) {
		 injecao.deleteById(id);
		 return true;
	}
	
	@PutMapping
	public Virus update (@RequestBody Virus virus) {
		return injecao.save(virus);
	}
}
