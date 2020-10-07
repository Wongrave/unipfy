package com.si.unipfy.artistas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController // informa que é um controlador que receberá requisições de outra aplicacao
@RequestMapping("/artistas") // informa o endereço URL para acessar as músicas.
@AllArgsConstructor
public class ArtistaController {

	@Autowired
    ArtistaRepository repository;

    @GetMapping("/returnAll")
    List<Artista> allArtistas(){
        return repository.findAll();
    }
    
    @PostMapping("/new")
    Artista newArtista(@RequestBody Artista artista) {
    	return repository.save(artista);
    }
}
