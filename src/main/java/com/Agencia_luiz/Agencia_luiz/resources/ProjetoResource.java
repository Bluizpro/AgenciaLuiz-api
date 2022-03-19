package com.Agencia_luiz.Agencia_luiz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Agencia_luiz.Agencia_luiz.entities.Pessoa;
import com.Agencia_luiz.Agencia_luiz.servicies.ProdutoService;

@RestController
@RequestMapping(value ="/pessoas")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjetoResource {
	@Autowired
	private ProdutoService service;
	@GetMapping	
	public List<Pessoa> findAll(){
		return service.findAll();
		}
	@PostMapping
	public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoas){
		service.save(pessoas);
		return ResponseEntity.ok().body(pessoas);
	}
	@DeleteMapping(value = "/{id}")
	 public ResponseEntity<Pessoa>delete(@PathVariable Long id){
		Pessoa pessoas = service.findById(id);
		service.delete(id);
		return ResponseEntity.ok().body(pessoas);
		
	}
	@PutMapping(value = "/update")
	public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoas) {
		pessoas = service.update(pessoas);
		return ResponseEntity.ok().body(pessoas);
	}
}
