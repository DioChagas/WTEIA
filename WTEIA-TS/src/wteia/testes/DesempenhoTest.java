package wteia.testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import wteia.atividade01.Desempenho;
import wteia.atividade01.ValorInvalidoException;

public class DesempenhoTest {

	private Desempenho desempenho;
	
	@Before
	public void init (){
		desempenho = new Desempenho();
	}
	
	@Test
	public void testVerificaAprovacao1() throws ValorInvalidoException{
		float nota1 = 8;
		float nota2 = 7;
		float freq = 0.88f;
		boolean esperado = true;
		boolean obtido = desempenho
				.verificarAprovacao(nota1, nota2, freq);
		Assert.assertEquals("TC001", esperado, obtido);
	}
	
	@Test
	public void testVericaAprovacao2() throws ValorInvalidoException{
		float nota1 = 10;
		float nota2 = 10;
		float freq = 1f;
		boolean esperado = true;
		
		boolean obtido = desempenho
				.verificarAprovacao(nota1, nota2, freq);
		Assert.assertEquals("TC002", esperado, obtido);
	}
	
	
	@Test
	public void testVericaAprovacao3() throws ValorInvalidoException{
		float nota1 = 10;
		float nota2 = 4;
		float freq = 0.75f;
		boolean esperado = true;
		
		boolean obtido = desempenho
				.verificarAprovacao(nota1, nota2, freq);
		Assert.assertEquals("TC003", esperado, obtido);
	}
	
	
	@Test
	public void testVericaAprovacao4() throws ValorInvalidoException{
		float nota1 = 4;
		float nota2 = 8;
		float freq = 0.80f;
		boolean esperado = false;
		
		boolean obtido = desempenho
				.verificarAprovacao(nota1, nota2, freq);
		Assert.assertEquals("TC004", esperado, obtido);
	}
	
	
	
	@Test(expected = ValorInvalidoException.class)
	public void testValoreInvalidos() throws ValorInvalidoException{
		
		float nota1 = -1;
		float nota2 = 8;
		float freq = 0.75f;
				
		desempenho.verificarAprovacao(nota1, nota2, freq);
		
	}
	

	
}
