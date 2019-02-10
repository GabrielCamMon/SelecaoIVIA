import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ContandoLetNumMain numMain = new ContandoLetNumMain();
		
	String inicial;
		JOptionPane.showMessageDialog(null, "Escreva dois números a partir de 1 até 1000, para saber quantas letras tem nesse intervalo de números.");
		
	try {
		int i = Integer.parseInt(inicial = JOptionPane.showInputDialog("Digite o número inicial"));
		int f = Integer.parseInt(inicial = JOptionPane.showInputDialog("Digite o número final"));
		
		if(i<1 || i> 1000 || f<1 || f>1000) {
			JOptionPane.showMessageDialog(null, "Valores inválidos");
		}else {
			if(i<=f) {
				JOptionPane.showMessageDialog(null,"Existem " + numMain.somaDe1a1000(i, f) +" letras a partir de " + i + " até " +  f );
			}else {
				JOptionPane.showMessageDialog(null, "O valor inicial não pode ser maior que o valor final");
			}
				}
	} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Entrada inválida");
	}
		
	}
}
