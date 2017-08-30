package br.com.caelum.estoque.rmi;

import java.beans.Transient;
import java.io.Serializable;

public class ItemEstoque implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private Integer quantidade;
	
	public ItemEstoque(String codigo, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	
	
}
