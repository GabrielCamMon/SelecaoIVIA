import java.util.HashMap;
import java.util.Map; 

//Classe que mostra a evolução do código
public class ContandoLetNum extends Valores{


	public ContandoLetNum() {
		super(mapNum);
			}
	
	public ContandoLetNum(Map<Integer, String> mapNum) {
		super(mapNum);
	}

	
//Utilizei esse metodo para saber se a lógica realmente funcionava com números que não possuiam padrões
	public Integer doisTemQuatroLetras(int num) {
		Integer retorno;
		retorno = mapNum.get(num).length();
		return retorno;
	}
	
	//Utilizei esse metodo para saber se a lógica realmente funcionava com as dezenas que possuiam padrões
		public Integer vinteEUmTemOitoLetras(int num) {
			Integer retorno;
			retorno =  mapNum.get(num % 10).length() + mapNum.get(num - (num % 10)).length() + 1;
			return retorno;
		}	
	
	//Utilizei esse metodo para saber se a lógica realmente funcionava com os números entre 100 e 120
		public Integer centoEOnzeTemDezLetra(int num) {
				Integer retorno;
				retorno =  mapNum.get(num - (num % 100)).length() + mapNum.get(num % 100).length() + 3;
				return retorno;
				}
		
	//Utilizei esse metodo para saber se a lógica realmente funcionava com os números entre 120 e 200 que dividido por 100 resto é diferente de 0
		public Integer centoEVinteEUMTem14Letra(int num) {
				Integer retorno;
				retorno = mapNum.get(num - (num % 100)).length() + mapNum.get((num % 100)-((num % 100)% 10)).length() + mapNum.get(((num % 100)% 10)).length() + 4;
				return retorno;
						}
	//Utilizei esse metodo para saber se a lógica realmente funcionava com os números entre 200 e 220
		public Integer duzentosEOnzeTem13Letra(int num) {
			Integer retorno;
			retorno =  mapNum.get(num - (num % 100)).length() + mapNum.get(num % 100).length() + 1;
			return retorno;
			}
	
//Utilizei esse metodo para saber se a lógica realmente funcionava com os números entre 220 e 300 que dividido por 100 resto é diferente de 0
	public Integer duzentosEVinteEUMTem17Letra(int num) {
			Integer retorno;
			retorno = mapNum.get(num - (num % 100)).length() + mapNum.get((num % 100)-((num % 100)% 10)).length() + mapNum.get(((num % 100)% 10)).length() + 2;
			return retorno;
					}
	
//Teste para saber se a Soma de um 1 a 9 funciona
	public Integer somaDe1a9(int inicio, int fim) {
		Integer retorno = 0;
		
		while(inicio <= fim ) {
			retorno = retorno + mapNum.get(inicio).length() ;
			inicio++;
		}
			
		return retorno;
	}
	
	//Teste para saber se a Soma de um 1 a 100 funciona
	public Integer somaDe1a100(int inicio, int fim) {
		Integer retorno = 0;
		
		while(inicio <= fim ) {
			if(inicio <=20) {
			retorno = retorno + mapNum.get(inicio).length();
			}else {
				if(inicio % 10 == 0) {
					retorno = retorno + mapNum.get(inicio).length();
				}else {
					retorno = retorno + mapNum.get(inicio - (inicio % 10)).length() + mapNum.get(inicio % 10).length()  + 1;
				}
			}
			
			inicio++;
		}
			
		return retorno;
	}
	
	//Codigo soma de 1 - 1000
	public Integer somaDe1a1000(int inicio, int fim) {
		Integer retorno = 0;
		
		while(inicio <= fim ) {
			if(inicio <20) {
			retorno = retorno + mapNum.get(inicio).length();
			}else {
				if(inicio<=100) {
					if(inicio % 10 == 0) {
						retorno = retorno + mapNum.get(inicio).length();
					}else {
						retorno = retorno + mapNum.get(inicio - (inicio % 10)).length() + mapNum.get(inicio % 10).length()  + 1;
					}
				}else {
					if( inicio < 200 ) {
						if((inicio % 100) < 20) {
							retorno = retorno +  mapNum.get(inicio - (inicio % 100)).length() + mapNum.get(inicio % 100).length() + 3;
						}else {
							if((inicio % 100)%10 == 0) {
								 retorno = retorno + mapNum.get(inicio - (inicio % 100)).length() + mapNum.get(inicio % 100).length()  + 3; 
							}else {
								retorno = retorno + mapNum.get(inicio - (inicio % 100)).length() + mapNum.get((inicio % 100)-((inicio % 100)% 10)).length() + mapNum.get(((inicio % 100)% 10)).length() + 4;
							}
						}
					}else {
						if(inicio % 100 == 0) {
							retorno = retorno + mapNum.get(inicio).length();
						}else {
							if((inicio % 100) < 20) {
								retorno = retorno + mapNum.get(inicio - (inicio % 100)).length() + mapNum.get(inicio % 100).length()  + 1;
							}else {
								if((inicio % 100)%10 == 0) {
									 retorno = retorno + mapNum.get(inicio - (inicio % 100)).length() + mapNum.get(inicio % 100).length() + 1; 
								}else {
									retorno = retorno + mapNum.get(inicio - (inicio % 100)).length() + mapNum.get((inicio % 100)-((inicio % 100)% 10)).length() + mapNum.get(((inicio % 100)% 10)).length() + 2;
								}
							}
						}
					}
				}
				
			}
			
			inicio++;
		}
			
		return retorno ;
	}
}

	
	


