package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//List<Topico> findByCursoNome(String nomeCurso);
	List<Topico> findByCurso_Nome(String nomeCurso); //padrão para identificar que "Nome" é um atributo da classe "Curso" e não "nomeCurso" é um atributo da classe Topico
	List<Topico> findByCursoNomeAndTituloOrId(String nomeCurso, String titulo, long id);
	List<Topico> findByCursoNomeLike(String nomeCurso);
	List<Topico> findByCursoNomeContainingIgnoreCase(String nomeCurso);
	
}
