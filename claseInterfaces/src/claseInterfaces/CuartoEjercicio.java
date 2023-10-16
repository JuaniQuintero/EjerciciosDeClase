package claseInterfaces;

import javax.swing.JOptionPane;

public class CuartoEjercicio {

	public static void main(String[] args) {
		int codigo = JOptionPane.showConfirmDialog(null, "Quieres darme un euro para una buena causa?","Donacion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if(codigo==JOptionPane.YES_OPTION) {
			System.out.println("Has pulsado SI");
		}else if(codigo==JOptionPane.NO_OPTION) {
			System.out.println("Has pulsado NO");
		}else {
			System.out.println("Has pulsado CANCELAR");
		}
	}

}
