package br.com.lucasfalcao.VendaFacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfalcao.VendaFacil.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

}
