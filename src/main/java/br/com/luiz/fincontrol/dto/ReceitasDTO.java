package br.com.luiz.fincontrol.dto;

import java.util.Date;

import br.com.luiz.fincontrol.entities.Receitas;

public class ReceitasDTO {

	private Long id;
	private String descricao;
	private Double valor;
	private Date data;
	
	public ReceitasDTO() {
	}

	public ReceitasDTO(Long id, String descricao, Double valor, Date data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	public ReceitasDTO(Receitas receitas) {
		id = receitas.getId();
		descricao = receitas.getDescricao();
		valor = receitas.getValor();
		data = receitas.getData();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
