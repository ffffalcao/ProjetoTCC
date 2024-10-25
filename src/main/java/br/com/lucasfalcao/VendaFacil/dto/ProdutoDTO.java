package br.com.lucasfalcao.VendaFacil.dto;

import org.springframework.beans.BeanUtils;

import br.com.lucasfalcao.VendaFacil.entity.ProdutoEntity;

public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private int precoCompra;
	private int precoVenda;
	
	public ProdutoDTO(ProdutoEntity produto) {
		BeanUtils.copyProperties(produto, this);
	}
	
	public ProdutoDTO() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(int precoCompra) {
		this.precoCompra = precoCompra;
	}
	public int getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(int precoVenda) {
		this.precoVenda = precoVenda;
	}
}
