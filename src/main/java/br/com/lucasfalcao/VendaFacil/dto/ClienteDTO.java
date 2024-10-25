package br.com.lucasfalcao.VendaFacil.dto;

import org.springframework.beans.BeanUtils;

import br.com.lucasfalcao.VendaFacil.entity.ClienteEntity;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String endereço;
	private String email;	
	
	public ClienteDTO(ClienteEntity cliente) {
		BeanUtils.copyProperties(cliente, this);
	}
	
	public ClienteDTO() {
		
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
