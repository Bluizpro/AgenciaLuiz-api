package com.Agencia_luiz.Agencia_luiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Agencia_luiz.Agencia_luiz.entities.Pessoa;
@Repository
public interface CadastroRepository extends JpaRepository<Pessoa, Long> {
	

}
 