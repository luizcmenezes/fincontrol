package br.com.luiz.fincontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.fincontrol.entities.Receitas;

public interface ReceitasRepository extends JpaRepository<Receitas, Long>{
	
}
