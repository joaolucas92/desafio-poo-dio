package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Professor {
	
	private String nome;
	private Set<Conteudo> conteudo = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "Professor [nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(nome, other.nome);
	}
	
}
