import java.util.HashMap;
import java.util.Map; 

//Codigo Principal  
public class ContandoLetNumMain extends Valores{

	
		public ContandoLetNumMain() {
			super(mapNum);
				}
		
		public ContandoLetNumMain(Map<Integer, String> mapNum) {
			super(mapNum);
		}


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
