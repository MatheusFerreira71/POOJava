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

import br.edu.fatecfranca.entities.Usuario;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	@GetMapping
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	@PostMapping
	public boolean addUsuario(@RequestBody Usuario usuario) {
		return this.usuarios.add(usuario);
	}
	
	@DeleteMapping("/{id}")
	public boolean removeUsuario (@PathVariable("id") int id) {
		for (Usuario usuario: this.usuarios) {
			if(usuario.getId() == id) {
				this.usuarios.remove(usuario);
				return true;
			}
		}
		return false;
	}
	
	@PutMapping
	public boolean atualizarUsuario(@RequestBody Usuario usuario) {
		for (Usuario x: this.usuarios) {
			if(x.getId() == usuario.getId()) {
				int pos = this.usuarios.indexOf(x);
				this.usuarios.set(pos, usuario);
				return true;
			}
		}
		return false;
	}
}
