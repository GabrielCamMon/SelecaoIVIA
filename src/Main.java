import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ContandoLetNumMain numMain = new ContandoLetNumMain();
		
	String inicial;
		JOptionPane.showMessageDialog(null, "Escreva dois n�meros a partir de 1 at� 1000, para saber quantas letras tem nesse intervalo de n�meros.");
		
	try {
		int i = Integer.parseInt(inicial = JOptionPane.showInputDialog("Digite o n�mero inicial"));
		int f = Integer.parseInt(inicial = JOptionPane.showInputDialog("Digite o n�mero final"));
		
		if(i<1 || i> 1000 || f<1 || f>1000) {
			JOptionPane.showMessageDialog(null, "Valores inv�lidos");
		}else {
			if(i<=f) {
				JOptionPane.showMessageDialog(null,"Existem " + numMain.somaDe1a1000(i, f) +" letras a partir de " + i + " at� " +  f );
			}else {
				JOptionPane.showMessageDialog(null, "O valor inicial n�o pode ser maior que o valor final");
			}
				}
	} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Entrada inv�lida");
	}
		
	}
}
