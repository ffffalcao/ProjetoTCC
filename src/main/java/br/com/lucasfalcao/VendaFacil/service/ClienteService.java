package br.com.lucasfalcao.VendaFacil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucasfalcao.VendaFacil.dto.ClienteDTO;
import br.com.lucasfalcao.VendaFacil.entity.ClienteEntity;
import br.com.lucasfalcao.VendaFacil.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> listarTodos(){
		List<ClienteEntity> clientes = clienteRepository.findAll();
		return clientes.stream().map(ClienteDTO::new).toList();
	}
	public void inserir(ClienteDTO cliente) {
		ClienteEntity clienteEntity = new ClienteEntity(cliente);
		clienteRepository.save(clienteEntity);
	}
	public ClienteDTO alterar (ClienteDTO cliente) {
		ClienteEntity clienteEntity = new ClienteEntity(cliente);
		return new ClienteDTO(clienteRepository.save(clienteEntity));
	}
	public void excluir(Long id) {
		ClienteEntity cliente = clienteRepository.findById(id).get();
		clienteRepository.delete(cliente);
	}
	public ClienteDTO buscarPorId(Long id) {
		return new ClienteDTO(clienteRepository.findById(id).get());
	}
}
