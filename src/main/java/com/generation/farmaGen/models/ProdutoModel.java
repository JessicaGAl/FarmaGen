package com.generation.farmaGen.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_produto")

public class ProdutoModel {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idProd;
	private @NotBlank String tituloProd;
	private @NotBlank String descricaoProd;
	private @NotNull double preco;
	private @NotNull boolean estoque;
	private @NotNull boolean receita;
	private @NotNull Long fk_categoria;
	public Long getIdProd() {
		return idProd;
	}
	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}
	public String getTituloProd() {
		return tituloProd;
	}
	public void setTituloProd(String tituloProd) {
		this.tituloProd = tituloProd;
	}
	public String getDescricaoProd() {
		return descricaoProd;
	}
	public void setDescricaoProd(String descricaoProd) {
		this.descricaoProd = descricaoProd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	public boolean isReceita() {
		return receita;
	}
	public void setReceita(boolean receita) {
		this.receita = receita;
	}
	public Long getFk_categoria() {
		return fk_categoria;
	}
	public void setFk_categoria(Long fk_categoria) {
		this.fk_categoria = fk_categoria;
	}

}
