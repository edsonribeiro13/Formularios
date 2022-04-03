package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.security.GeneralSecurityException;

import javax.swing.JOptionPane;

import visao.Frame;

public class ControladorFrame implements ActionListener{

	Frame frame;
	public ControladorFrame() {
		frame = new Frame();
//		frame.getItemSalvar().addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getMenuSalvar()) {
			JOptionPane.showMessageDialog(null, "Salvo");
		}


		
	}

}
