package claseInterfaces;

import javax.swing.JOptionPane;

public class TercerEjercicio {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null,"Dime tu nombre", "Consulta de datos", JOptionPane.QUESTION_MESSAGE);
		if(nombre!=null) {
			System.out.println("Has pulsado ok, tu nombre es: " + nombre);
		}else {
			System.out.println("Le has dado a cancelar");
		}
	}
}
