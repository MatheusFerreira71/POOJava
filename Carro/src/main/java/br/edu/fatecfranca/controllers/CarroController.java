package br.edu.fatecfranca.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.Carro;

@RestController
@RequestMapping("api/carro")
public class CarroController {
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	
	@GetMapping
	public List<Carro> getCarros() {
		return this.carros;
	}
	
	@PostMapping
	public boolean addCarro(@RequestBody Carro carro) {
		return this.carros.add(carro);
	}
	
	@DeleteMapping("/{id}")
	public boolean removeCarro (@PathVariable("id") int id) {
		for (Carro carro: this.carros) {
			if(carro.getId() == id) {
				this.carros.remove(carro);
				return true;
			}
		}
		return false;
	}
	
	@PutMapping
	public boolean atualizarCarro(@RequestBody Carro carro) {
		for (Carro x: this.carros) {
			if(x.getId() == carro.getId()) {
				int pos = this.carros.indexOf(x);
				this.carros.set(pos, carro);
				return true;
			}
		}
		return false;
	}
}
