package wteia.testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import wteia.atividade02.ContagemMoedas;

import org.junit.Before;

public class ContagemMoedasTest {
	
	private ContagemMoedas contagemMoedas;

	@Before
	public void init(){
		contagemMoedas = new ContagemMoedas();
	}
	
	@Test
	public void testValores1() throws Exception{
		int [] minhasMoedas = {1,1,1,1,1,1};
		int [] esperado = {1,91};
		
		int [] obtido = contagemMoedas
				.calcularValorMoedas(minhasMoedas);
		
		Assert.assertArrayEquals("CT001", esperado,obtido);
	}
	
	
	@Test
	public void testValores2() throws Exception{
		int [] minhasMoedas = {1,1,1,1,1,2};
		int [] esperado = {2,91};
		
		int [] obtido = contagemMoedas
				.calcularValorMoedas(minhasMoedas);
		
		Assert.assertArrayEquals("CT002", esperado,obtido);
	}
	
	@Test
	public void testValores3() throws Exception{
		int [] minhasMoedas = {1,1,1,1,1,251};
		int [] esperado = {251,90};
		
		int [] obtido = contagemMoedas
				.calcularValorMoedas(minhasMoedas);
		
		Assert.assertArrayEquals("CT003", esperado,obtido);
	}
	
	@Test
	public void testValores4() throws Exception{
		int [] minhasMoedas = {200,200,200,200,200,1};
		int [] esperado = {1000};
		
		int [] obtido = contagemMoedas
				.calcularValorMoedas(minhasMoedas);
		
		Assert.assertArrayEquals("CT004", esperado,obtido);
	}
	
	
}
