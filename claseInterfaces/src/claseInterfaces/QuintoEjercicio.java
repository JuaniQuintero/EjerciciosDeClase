package claseInterfaces;

import javax.swing.JOptionPane;

public class QuintoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo=JOptionPane.showConfirmDialog(null, "Quieres darme un euro?", "Donacion", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if(codigo==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Le has dado a SI", "Eleccion", JOptionPane.INFORMATION_MESSAGE);
		}else if(codigo==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Le has dado a NO", "Eleccion", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Le has dado a CANCELAR", "Eleccion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
