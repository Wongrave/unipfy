package com.si.unipfy.musicas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController // informa que é um controlador que receberá requisições de outra aplicacao
@RequestMapping("/musicas") // informa o endereço URL para acessar as músicas.
@AllArgsConstructor
public class MusicaController {
	
	@Autowired
    MusicaRepository repository;

    @GetMapping("/returnAll")
    List<Musica> allMusics(){
        return repository.findAll();
    }
    
    @PostMapping("/new")
    Musica newMusica(@RequestBody Musica musica) {
    	return repository.save(musica);
    }

    @RequestMapping("/home")
    String home(){
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/idDaNumb")
    Musica getMusica(){
        return new Musica(1L, "Numb", "04:39", 2L, "Rock" );
    }

    //@PostMapping("Arroz")


    }



