package br.com.caelum.jaxb;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteMarshalJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Livro livro = new Livro();
		livro.setCodigo("ARQ");
		Categoria categoria = new Categoria();
		categoria.setNome("TI");
		livro.setCategoria(categoria);
		livro.setNomeAutor("José");
		livro.setTitulo("Livro");
		livro.setValor(new BigDecimal("1"));
		
		
		File arquivo = new File("livro.json");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(arquivo, livro);
		
		Livro livroLido = mapper.readValue(arquivo, Livro.class);
		
		System.out.println(livroLido);
		
	}

}
