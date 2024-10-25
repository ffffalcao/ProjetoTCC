package br.com.lucasfalcao.VendaFacil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucasfalcao.VendaFacil.dto.ProdutoDTO;
import br.com.lucasfalcao.VendaFacil.entity.ProdutoEntity;
import br.com.lucasfalcao.VendaFacil.repository.ProdutoRepository;
@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<ProdutoDTO> listarTodos(){
		List<ProdutoEntity> produtos = produtoRepository.findAll();
		return produtos.stream().map(ProdutoDTO::new).toList();
	}
	
	public void inserir(ProdutoDTO produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity(produto);
		produtoRepository.save(produtoEntity);	
	}
	public ProdutoDTO alterar (ProdutoDTO produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity(produto);
		return new ProdutoDTO(produtoRepository.save(produtoEntity));
	}
	public void excluir (Long id) {
		ProdutoEntity produto = produtoRepository.findById(id).get();
		produtoRepository.delete(produto);
	}
	public ProdutoDTO buscarPorId(Long id) {
		return new ProdutoDTO(produtoRepository.findById(id).get());
	}
}
