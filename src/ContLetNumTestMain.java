import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Teste do Codigo principal
class ContLetNumTestMain {
	
	//Teste de veracidade  se "cinco" retorna 5 letras
	@Test
	public void cincoDeveRetornar5Letras( ) {
		ContandoLetNumMain numlet = new ContandoLetNumMain();
		int result = numlet.somaDe1a1000(5, 5);
		assertEquals(5, result);
	}

	//Teste de veracidade  se "quinze" retorna 6 letras
	@Test
	public void quinzeDeveRetornar6Letras( ) {
		ContandoLetNumMain numlet = new ContandoLetNumMain();
		int result = numlet.somaDe1a1000(15, 15);
		assertEquals(6, result);
	}
	
	
	//Teste de veracidade  se "trinta e um" retorna 9 letras
		@Test
		public void vinteEUMDeveRetornar9Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(31, 31);
			assertEquals(9, result);
		}
	
	//Teste de veracidade  se "cem" retorna 3 letras
		@Test
		public void cemDeveRetornar3Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(100, 100);
			assertEquals(3, result);
		}

		
	//Teste de veracidade  se "cento e quinze" retorna 12 letras
		@Test
		public void cemDeveRetornar12Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(115, 115);
			assertEquals(12, result);
		}
		
	//Teste de veracidade  se "cento e trinta e dois" retorna 17 letras
		@Test
		public void centoETrintaEDoisDeveRetornar17Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(132, 132);
			assertEquals(17, result);
		}
		
		//Teste de veracidade  se "oitocentos e dezoito" retorna 18 letras
		@Test
		public void oitocentosEDezoitoDeveRetornar18Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(818, 818);
			assertEquals(18, result);
		}

		//Teste de veracidade  se "novecentos e cinquenta" retorna 20 letras
		@Test
		public void novecentosECinquentaDeveRetornar20Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(950, 950);
			assertEquals(20, result);
		}
		
		//Teste de veracidade  se "novecentos e cinquenta e um" retorna 23 letras
		@Test
		public void novecentosECinquentaEUmDeveRetornar23Letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(951, 951);
			assertEquals(23, result);
		}
		
		
	//Teste de veracidade  se "mil" retorna 3 letras
		@Test
		public void mildeveRetornar3letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(1000, 1000);
			assertEquals(3, result);
		}
		

		//Teste de veracidade se "1-9" retorna 37 letras
		@Test
		public void umA9deveRetornar37letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(1, 9);
			assertEquals(37, result);
		}
		
		//Teste de veracidade se "10-19" retorna 63 letras
		@Test
		public void dezA19deveRetornar63letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(10, 19);
			assertEquals(63, result);
		}
		
		//Teste de veracidade se "1-19" retorna 100 letras
		@Test
		public void umA10deveRetornar40letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(1, 19);
			assertEquals(100, result);
		}
		
	//Teste de veracidade se "1-99" retorna 1038 letras
		@Test
		public void umA99deveRetornar1038letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(1, 99);
			assertEquals(1038, result);
		}
	//Teste de veracidade se "1-1000" retorna 19672 letras
		@Test
		public void umA1000deveRetornar19672letras( ) {
			ContandoLetNumMain numlet = new ContandoLetNumMain();
			int result = numlet.somaDe1a1000(1, 1000);
			assertEquals(19672, result);
		}
		
		

}
