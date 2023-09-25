package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AtualizacaoTopicoForm {
	@NotNull @NotBlank @Size(min = 5,max=200,message = "deve esta entre 5 e 200 meu caro.")
	private String titulo;
	@NotNull @NotBlank @Size(max=100)
	private String mensagem;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topicoAtualizado = topicoRepository.getReferenceById(id);
		topicoAtualizado.setTitulo(this.titulo);
		topicoAtualizado.setMensagem(this.mensagem);
		topicoRepository.save(topicoAtualizado);
		return topicoAtualizado;
	}	
}
