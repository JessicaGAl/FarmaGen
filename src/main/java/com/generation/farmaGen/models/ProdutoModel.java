package com.generation.farmaGen.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_produto")

public class ProdutoModel {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idProd;
	private @NotBlank @Size(max = 60) String tituloProd;
	private @NotBlank @Size(max = 250) String descricaoProd;
	private @NotNull double preco;
	private @NotNull boolean estoque;
	private @NotNull boolean receita;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
    @JoinColumn (name = "fk_categoria")
    private CategoriaModel categoria;
	
	
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
	public CategoriaModel getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	

}
