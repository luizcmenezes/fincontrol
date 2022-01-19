package br.com.luiz.fincontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.luiz.fincontrol.dto.ReceitasDTO;
import br.com.luiz.fincontrol.entities.Receitas;
import br.com.luiz.fincontrol.repositories.ReceitasRepository;

@Service
public class ReceitasService {

	@Autowired
	private ReceitasRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ReceitasDTO> findAll(Pageable pageable) {
		Page<Receitas> result = repo.findAll(pageable);
		Page<ReceitasDTO> page = result.map(x -> new ReceitasDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ReceitasDTO findById(Long id) {
		ReceitasDTO dto = new ReceitasDTO(repo.findById(id).get());
		return dto;
	}

}
