package com.si.unipfy.musicas;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.si.unipfy.artistas.Artista;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity // Anotacao para definir nosso objeto com uma entidade relacional do Banco de Dados
@NoArgsConstructor // Gera um construtor sem parâmetros para esse objeto
@AllArgsConstructor // Gera um coonstrutor com todos os parâmetros para esse objeto
@Data // Gera os principais métodos utilizados por uma classe de dados (get, set, etc)
@Table(name = "musica_01")
public class Musica {

    @Id // Indica que é uma primary key de identificacao
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identifica esse item como auto-increment
    @Column(name = "id_01") // Indica a coluna da tabela que faz referêcia ao item
    private Long id;

    @Column(name = "nome_01")
    private String nome;

    @Column(name = "duracao_01")
    private String duracao;

    @Column(name = "genero_01")
    private String genero;
    
    @ManyToOne
    @JoinColumn(name = "id_02")
    private Artista artista;

    public Musica(long l, String s, String s1, long l1, String s2) {
        id = 1L;
        nome = s;
        duracao = s1;
        genero = s2;
        
    }
    
}
