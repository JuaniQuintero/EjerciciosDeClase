package claseInterfaces;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SextoEjercicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.put("OptionPane.yesButtonText", "Sí");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		
		int opcion = JOptionPane.showConfirmDialog(null, "Quieres continuar?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(opcion==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null,"Le has dado a SI");
		}else {
			JOptionPane.showMessageDialog(null, "Le has dado a NO");
		}
	}
}
