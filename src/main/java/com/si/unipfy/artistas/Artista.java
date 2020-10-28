package com.si.unipfy.artistas;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.si.unipfy.musicas.Musica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity // Anotacao para definir nosso objeto com uma entidade relacional do Banco de Dados
@NoArgsConstructor // Gera um construtor sem parâmetros para esse objeto
@AllArgsConstructor // Gera um coonstrutor com todos os parâmetros para esse objeto
@Data // Gera os principais métodos utilizados por uma classe de dados (get, set, etc)
@Table(name = "artista_02")
public class Artista {

	@Id // Indica que é uma primary key de identificacao
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identifica esse item como auto-increment
    @Column(name = "id_02") // Indica a coluna da tabela que faz referêcia ao item
    private Long id;

    @Column(name = "nome_02")
    private String nome;
    
    @Column(name = "imagem_02")
    private String imagem;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "artista", targetEntity = Musica.class, fetch = FetchType.LAZY)
    private List<Musica> musicas;
	
}
