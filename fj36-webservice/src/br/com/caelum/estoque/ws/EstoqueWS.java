package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://caelum.com.br/estoquews/v1")
@Stateless
public class EstoqueWS {
	
	private Map<String, ItemEstoque> repositorio = new HashMap<>();

	public EstoqueWS() {		
		repositorio.put("SOA", new ItemEstoque("SOA", 5));
		repositorio.put("TDD", new ItemEstoque("TDD", 1));
		repositorio.put("RES", new ItemEstoque("RES", 2));
		repositorio.put("LOG", new ItemEstoque("LOG", 4));
		repositorio.put("WEB", new ItemEstoque("WEB", 1));
		repositorio.put("ARQ", new ItemEstoque("ARQ", 2));
	}
	
	
	@WebMethod(operationName="ItensPeloCodigo")
	@WebResult(name="ItemEstoque")
	public List<ItemEstoque> getQuantidade(
			@WebParam(name="codigo") List<String> codigoProduto,
			@WebParam(name="tokenUsuario", header=true) String token) throws AutorizacaoException {
		
		if (token== null || !token.equals("TOKEN123")) {
			throw new AutorizacaoException("Nao autorizado");
		}
		
		List<ItemEstoque> itens = new ArrayList<>();
		
		if(codigoProduto == null || codigoProduto.isEmpty()) {
			return itens;
		}
 		
		for(String codigo : codigoProduto) {
			if(repositorio.containsKey(codigo)) {
				itens.add(repositorio.get(codigo));
			}
				
		}

		System.out.println("EstoqueWS: Lista de itens");

		return itens;		
	}
	
	@WebMethod
	public String addItemEstoque(String codigo, Integer quantidade) {
	  ItemEstoque item = new ItemEstoque(codigo,quantidade);
	  repositorio.put(codigo, item);
	  
	  return "Ok";
	}
}
