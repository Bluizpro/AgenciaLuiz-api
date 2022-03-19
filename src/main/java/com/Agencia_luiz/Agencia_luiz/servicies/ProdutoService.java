package com.Agencia_luiz.Agencia_luiz.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Agencia_luiz.Agencia_luiz.entities.Pessoa;
import com.Agencia_luiz.Agencia_luiz.repositories.CadastroRepository;
@Service
public class ProdutoService {
	@Autowired
	private CadastroRepository repository;

	@Transactional(readOnly = true)
	public List<Pessoa>findAll(){
		List<Pessoa> resultado = repository.findAll();
		return resultado;
	}
	public void save(Pessoa pessoas) {
		repository.save(pessoas);
	}
	public void delete(Long id) {
		Optional<Pessoa>pessoas = repository.findById(id);
		if (pessoas.isPresent()) {
			repository.delete(pessoas.get());
		}else {
			System.out.println("Cadastro nao existe");
		}
		}
	public Pessoa update(Pessoa pessoas) {
		return repository.save(pessoas);
	}
	public Pessoa findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
