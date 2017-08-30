package br.com.caelum.estoque.ws;

public class ItemEstoque{
	
	private String codigo;
	private Integer quantidade;
	
	ItemEstoque(){
		
	}
	
	public ItemEstoque(String codigo, Integer quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	
	
}
