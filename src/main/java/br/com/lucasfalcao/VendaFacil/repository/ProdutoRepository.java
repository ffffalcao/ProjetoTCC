package br.com.lucasfalcao.VendaFacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfalcao.VendaFacil.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
