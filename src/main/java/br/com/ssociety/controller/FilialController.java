package br.com.ssociety.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.ssociety.entities.Filial;
import br.com.ssociety.repository.FilialRepository;

@RestController
public class FilialController {
	
	@Autowired
	private FilialRepository repository;

	@GetMapping(path = "/buscalFilial/{empresa}")
	public ResponseEntity<Page<Filial>> buscaFilial(@PathVariable(value = "empresa") String empresa){
		Page<Filial> filias = repository.findByPkCodigoEmpresa(empresa,PageRequest.of(0, 100));
		return new ResponseEntity<Page<Filial>>(filias, HttpStatus.OK);
	}
}
