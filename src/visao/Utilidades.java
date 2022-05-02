package visao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Utilidades {

    private static JButton botao = new JButton("Salvar");
    private static JTextField campo1 = new JTextField();
    private static JTextField campo2 = new JTextField();
    private static JTextField campo3 = new JTextField();
    private static JTextField campo4 = new JTextField();
    private static JTextField campo5 = new JTextField();
    private static JTextField campo6 = new JTextField();
    private static JTextField campo7 = new JTextField();
    private static JTextField campo8 = new JTextField();
    private static JTextField campo9 = new JTextField();
	private static JTextField campo10 = new JTextField();
	private static JTextField campo11 = new JTextField();
	private static JTextField campo12 = new JTextField();
	private static JTextField campo13 = new JTextField();
	private static JTextField campo14 = new JTextField();
    

    public static Color getColor(){
        final Color COR = new Color(105, 67, 111);
        return COR;
    }

    public static Font getFonteTitulo(){
        final Font fonteTitulo = new Font("Arial Italic", 3, 40);
        return fonteTitulo;
    }

    public static Font getFonteRotulo(){
        final Font fonteRotulo = new Font("Arial Italic", 3, 20);
        return fonteRotulo;
    }

    public static JButton getButton(int x, int y){
        botao.setBounds(x, y, 100, 50);
        return botao;
    } 

    public static JButton getButton(){
        return botao;
    } 

    public static JTextField getCampo1(int x, int y) {
		campo1.setBounds(x, y, 300, 40);
		return campo1;
	}

	public static JTextField getCampo2(int x, int y) {
		campo2.setBounds(x, y, 300, 40);
		return campo2;
	}

	public static JTextField getCampo3(int x, int y) {
		campo3.setBounds(x, y, 300, 40);
		return campo3;
	}

	public static JTextField getCampo4(int x, int y) {
		campo4.setBounds(x, y, 300, 40);

		return campo4;
	}

	public static JTextField getCampo5(int x, int y) {
		campo5.setBounds(x, y, 300, 40);
		return campo5;
	}

	public static JTextField getCampo6(int x, int y) {
		campo6.setBounds(x, y, 300, 40);

		return campo6;
	}

	public static JTextField getCampo7(int x, int y) {
		campo7.setBounds(x, y, 300, 40);
		return campo7;
	}

	public static JTextField getCampo8(int x, int y) {
		campo8.setBounds(x, y, 300, 40);

		return campo8;
	}

	public static JTextField getCampo9(int x, int y) {
		campo9.setBounds(x, y, 300, 40);
		return campo9;
	}

	public static JTextField getCampo10(int x, int y) {
		campo10.setBounds(x, y, 300, 40);
		return campo10;
	}

	public static JTextField getCampo11(int x, int y) {
		campo11.setBounds(x, y, 300, 40);
		return campo11;
	}

	public static JTextField getCampo12(int x, int y) {
		campo12.setBounds(x, y, 300, 40);
		return campo12;
	}

	public static JTextField getCampo13(int x, int y) {
		campo13.setBounds(x, y, 300, 40);
		return campo13;
	}
	
	public static JTextField getCampo14(int x, int y) {
		campo14.setBounds(x, y, 300, 40);
		return campo14;
	}


}
