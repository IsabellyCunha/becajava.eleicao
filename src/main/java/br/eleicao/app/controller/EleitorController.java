package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eleicao.app.model.Eleitor;
import br.eleicao.app.repository.EleitorRepository;

@RestController
@RequestMapping("/eleitores")
public class EleitorController {
	
	final EleitorRepository _eleitorRepository;	//Criando propriedade da Interface Município
	
	
	public EleitorController(EleitorRepository eleitorRepository) {
		_eleitorRepository = eleitorRepository; //Alimentando a propriedade com a construção da classe
	}
	
	@PostMapping
    public ResponseEntity inserir(@RequestBody Eleitor eleitor) {		
		_eleitorRepository.save(eleitor);		
		return ResponseEntity.status(HttpStatus.CREATED).body("Eleitor criado com sucesso!");
    }
	
	
	@GetMapping
    public ResponseEntity listar() {
		Iterable<Eleitor> eleitores = _eleitorRepository.findAll();		
    	return ResponseEntity.status(HttpStatus.OK).body(eleitores);
    }
	
	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Eleitor> eleitor = _eleitorRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(eleitor);
    }
	

    @PutMapping(path = "/{id}")
    public ResponseEntity atualizar(@RequestBody Eleitor eleitor, @PathVariable Long id) {
    	eleitor.setId(id);
    	_eleitorRepository.save(eleitor);		
        return ResponseEntity.status(HttpStatus.OK).body("Eleitor atualizado com sucesso!");
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
    	_eleitorRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
