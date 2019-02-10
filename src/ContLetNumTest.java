import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//classe que mostra os testes das evoluções dos códigos
class ContLetNumTest {

	//Teste de veracidade se o dois tem quatro letras
	@Test
	public void DeveRetornarQuatro( ) {
		ContandoLetNum numlet = new ContandoLetNum();
		int result = numlet.doisTemQuatroLetras(2);
		assertEquals(4, result);
	}
	
	//Teste de veracidade se o "vinte e um" tem 8 letras
	@Test
	public void deveRetornarOito( ) {
		ContandoLetNum numlet = new ContandoLetNum();
		int result = numlet.vinteEUmTemOitoLetras(21);
		assertEquals(8, result);
	}
	
	//Teste de veracidade se o "cento e onze" tem 10 letras
	@Test
	public void deveRetornarDez( ) {
		ContandoLetNum numlet = new ContandoLetNum();
		int result = numlet.centoEOnzeTemDezLetra(111);
		assertEquals(10, result);
	}
	
	//Teste de veracidade se o "cento e vinte e um" tem 14 letras
		@Test
		public void deveRetornar14( ) {
			ContandoLetNum numlet = new ContandoLetNum();
			int result = numlet.centoEVinteEUMTem14Letra(121);
			assertEquals(14, result);
		}
		//Teste de veracidade se o "duzentos e onze" tem 13 letras
		@Test
		public void deveRetornar13( ) {
			ContandoLetNum numlet = new ContandoLetNum();
			int result = numlet.duzentosEOnzeTem13Letra(211);
			assertEquals(13, result);
		}
	
		//Teste de veracidade se o "duzentos e vinte e um" tem 17 letras
				@Test
				public void deveRetornar17( ) {
					ContandoLetNum numlet = new ContandoLetNum();
					int result = numlet.duzentosEVinteEUMTem17Letra(221);
					assertEquals(17, result);
				}
			
	//Teste de veracidade da soma de letras de 1 a 9
		@Test
		public void deveRetornar37( ) {
			ContandoLetNum numlet = new ContandoLetNum();
			int result = numlet.somaDe1a9(1, 9);
			assertEquals(37, result);
		}
		
	//Teste de veracidade da soma de letras de 1 a 100
		@Test
		public void deveRetornar1041( ) {
			ContandoLetNum numlet = new ContandoLetNum();
			int result = numlet.somaDe1a100(1, 100);
			assertEquals(1041, result);
		}
		
	//Teste de veracidade da soma de letras de 1 a 1000
		@Test
		public void deveRetornar19672( ) {
			ContandoLetNum numlet = new ContandoLetNum();
			int result = numlet.somaDe1a1000(1, 1000);
			assertEquals(19672, result);
		}
}
