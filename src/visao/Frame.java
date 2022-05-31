package visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JMenu menuSalvar;
	private static JMenu menuConsulta;
	
	private static JMenuBar bar;
	
	private static Frame frame;
	
	public Frame() {
		
		super();
		
	}
	
	public static Frame novoFrame() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		frame.setSize(800, 900);
		frame.setLocationRelativeTo(null);
		
		frame.setJMenuBar(getBar());
		
		return frame;
	}
	
	public static Frame getFrame(){
		if(frame == null){
			frame = new Frame();
			frame = Frame.novoFrame();
		}
		
		return frame;
	}

	public static JMenuBar getBar() {
		if(bar == null)
			bar = new JMenuBar();
		bar.add(getMenuSalvar());
		bar.add(getMenuConsulta());
		return bar;
	}

	public static JMenu getMenuSalvar() {
		if (menuSalvar == null) {
			menuSalvar = new JMenu();
		}
		
		menuSalvar = MenuItems.novoSalvar();
		
		return menuSalvar;
	}

	public static JMenu getMenuConsulta() {
		if (menuConsulta == null) {
			menuConsulta = new JMenu();
		}
		
		menuConsulta = MenuItems.novoConsultar();
		
		return menuConsulta;
	} 

}
