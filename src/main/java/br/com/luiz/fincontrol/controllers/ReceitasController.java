package br.com.luiz.fincontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.fincontrol.dto.ReceitasDTO;
import br.com.luiz.fincontrol.services.ReceitasService;

@RestController
@RequestMapping(value = "/receitas")
public class ReceitasController {

	@Autowired
	private ReceitasService service;
	
	@GetMapping
	public Page<ReceitasDTO> findAll (Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ReceitasDTO findById (@PathVariable Long id){
		return service.findById(id);
	}
}
