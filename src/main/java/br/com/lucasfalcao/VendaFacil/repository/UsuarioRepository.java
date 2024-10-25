package br.com.lucasfalcao.VendaFacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfalcao.VendaFacil.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
