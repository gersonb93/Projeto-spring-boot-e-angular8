package curso.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Cliente;
import curso.api.rest.repositoy.ClienteRepository;

@RestController /* Arquitetura REST */
@RequestMapping(value = "/cliente/**")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Cliente>> clientes() {

		List<Cliente> lista = (List<Cliente>) clienteRepository.findAll();

		return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);

	}
	
	@DeleteMapping(value = "/{idcli}", produces = "application/text")
	public String delete(@PathVariable("id") Long id) {

		clienteRepository.deleteById(id);

		return "ok";
	}

}