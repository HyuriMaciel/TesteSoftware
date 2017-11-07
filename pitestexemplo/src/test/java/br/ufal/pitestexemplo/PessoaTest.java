package br.ufal.pitestexemplo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaTest {
Pessoa pessoa;
	
	@Before
	public void setUp(){
		pessoa = new Pessoa ();
	}
	
	@Test
	public void test01(){
		pessoa.setName("Maria");
		assertEquals("Maria", pessoa.getName());
	}
	
	@Test
	public void test02(){
		pessoa.setIdade(15);
		pessoa.completouAno();
		assertEquals(16, pessoa.getIdade());
	}
	
	@Test
	public void test03(){
		pessoa.setProfissao("Professora");
	}

}
