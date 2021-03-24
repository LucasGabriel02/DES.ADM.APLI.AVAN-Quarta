/**
 * 
 */
package br.com.cbgomes.acme.client.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbgomes.acme.client.domain.Client;
import br.com.cbgomes.acme.client.repository.ClientRepository;
import br.com.cbgomes.acme.exception.ValidacaoException;

/**
 * @author cbgomes
 *
 */
@RestController
@RequestMapping("/api/clients")
public class ClientResource {
	
	@Autowired
	private ClientRepository repository;
	

	//put
	//delete
	
	@GetMapping
	public List<Client> getAllClients(){
		List<Client> clients = this.repository.findAll();
		return clients;
	}
	
	@PostMapping
	public void createClient(@RequestBody Client client) {
		this.repository.save(client);
	}
	
	@DeleteMapping("/{id}")
	private void deleteCliente(@PathVariable("id") Long id) {
		this.repository.deleteById(id);

	}
	
	@GetMapping
	public List<Client> getAllClient(){
		return this.repository.findAll();
	}
	
	
	@PutMapping
	public Client createAtualizarCliente(@RequestBody Client client) {
		return this.repository.save(client);
	}
	
	@GetMapping
	public Client getCliente(@PathVariable Long id){
		if(id!= null) {
			return this.repository.findById(id).get();
			
		}
		throw new ValidacaoException("cliente invalido");
	}
	
	
}











