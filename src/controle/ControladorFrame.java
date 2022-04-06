package controle;

import visao.Frame;

public class ControladorFrame{

	static Frame frame;
	
	public ControladorFrame() {
		frame = new Frame();
		frame = Frame.novoFrame();
//		frame.getItemSalvar().addActionListener(this);
	}
	
	public static Frame getFrameAtual() {
		return frame;
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}
	
}
