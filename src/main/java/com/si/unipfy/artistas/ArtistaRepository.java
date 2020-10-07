package com.si.unipfy.artistas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

	@Query(value = 	"select a.* " + 
					"from artista_02 a, " +
					"musica_01 m " +
					"where m.id_02 = a.id_02 " +
					"and m.id_01 = :idMusica", 
			nativeQuery = true)	
	Artista findOneByMusicaId(Long idMusica);
}
