package br.com.lucasfalcao.VendaFacil.entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.lucasfalcao.VendaFacil.dto.ProdutoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VF_PRODUTO")
public class ProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int precoCompra;
	
	@Column(nullable = false)
	private int precoVenda;
	
	public ProdutoEntity(ProdutoDTO produto) {
		BeanUtils.copyProperties(produto, this);
	}
	
	public ProdutoEntity() {
		
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoEntity other = (ProdutoEntity) obj;
		return Objects.equals(id, other.id);
	}
}
