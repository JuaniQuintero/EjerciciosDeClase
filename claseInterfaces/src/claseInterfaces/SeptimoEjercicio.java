package claseInterfaces;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SeptimoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.put("OptionPane.yesButtonText", "Sí");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		
		String nombre=JOptionPane.showInputDialog(null,"Dime tu nombre", "Pedir nombre",JOptionPane.INFORMATION_MESSAGE);
		int opcion = JOptionPane.showConfirmDialog(null, "Bienvenido "+nombre+", ¿Quieres continuar?",
				"Pregunta",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		
		if(opcion==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null,"Le has dado a SI");
		}else if(opcion==JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Le has dado a NO");
		}else {
			JOptionPane.showMessageDialog(null, "Le has dado a CANCELAR");
		}
	}

}
