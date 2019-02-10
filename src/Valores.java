import java.util.HashMap;
import java.util.Map;

public class Valores {
	static Map<Integer, String> mapNum = new HashMap<>();

	public Valores(Map<Integer, String> mapNum) {
		this.mapNum = mapNum;
		
		mapNum.put(1, "um"); mapNum.put(2, "dois"); mapNum.put(3, "tres"); mapNum.put(4, "quatro"); mapNum.put(5, "cinco");
		mapNum.put(6, "seis"); mapNum.put(7, "sete"); mapNum.put(8, "oito"); mapNum.put(9, "nove"); mapNum.put(10, "dez");
		
		mapNum.put(11, "onze"); mapNum.put(12, "doze"); mapNum.put(13, "treze"); mapNum.put(14, "quatorze"); mapNum.put(15, "quinze");
		mapNum.put(16, "dezesseis"); mapNum.put(17, "dezessete"); mapNum.put(18, "dezoito"); mapNum.put(19, "dezenove");
		
		mapNum.put(20, "vinte"); mapNum.put(30, "trinta"); mapNum.put(40, "quarenta"); mapNum.put(50, "cinquenta");
		mapNum.put(60, "sessenta"); mapNum.put(70, "setenta"); mapNum.put(80, "oitenta"); mapNum.put(90, "noventa");
		
		mapNum.put(100, "cem"); mapNum.put(200, "duzentos"); mapNum.put(300, "trezentos"); mapNum.put(400, "quatrocentos"); mapNum.put(500, "");
		mapNum.put(500, "quinhentos"); mapNum.put(600, "seiscentos"); mapNum.put(700, "setecentos"); mapNum.put(800, "oitocentos"); mapNum.put(900, "novecentos");
		mapNum.put(1000, "mil");
		
		
		
	}	
	
}
