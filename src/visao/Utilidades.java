package visao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Utilidades {

    private static JButton botao = new JButton("Salvar");
	private static JButton botaoPesquisa = new JButton("Buscar");
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
        Utilidades.botao.setBounds(x, y, 100, 50);
        return botao;
    }
	
	public static JButton getButtonPesquisar(int x, int y){
        Utilidades.botaoPesquisa.setBounds(x, y, 100, 50);
        return botaoPesquisa;
    } 

    public static JButton getButton(){
        return botao;
    }

	public static JButton getButtonPesquisar(){
        return botaoPesquisa;
    } 

    public static JTextField getCampo1(int x, int y) {
		Utilidades.campo1.setBounds(x, y, 300, 40);
		return campo1;
	}

	public static JTextField getCampo2(int x, int y) {
		Utilidades.campo2.setBounds(x, y, 300, 40);
		return campo2;
	}

	public static JTextField getCampo3(int x, int y) {
		Utilidades.campo3.setBounds(x, y, 300, 40);
		return campo3;
	}

	public static JTextField getCampo4(int x, int y) {
		Utilidades.campo4.setBounds(x, y, 300, 40);

		return campo4;
	}

	public static JTextField getCampo5(int x, int y) {
		Utilidades.campo5.setBounds(x, y, 300, 40);
		return campo5;
	}

	public static JTextField getCampo6(int x, int y) {
		Utilidades.campo6.setBounds(x, y, 300, 40);

		return campo6;
	}

	public static JTextField getCampo7(int x, int y) {
		Utilidades.campo7.setBounds(x, y, 300, 40);
		return campo7;
	}

	public static JTextField getCampo8(int x, int y) {
		Utilidades.campo8.setBounds(x, y, 300, 40);

		return campo8;
	}

	public static JTextField getCampo9(int x, int y) {
		Utilidades.campo9.setBounds(x, y, 300, 40);
		return campo9;
	}

	public static JTextField getCampo10(int x, int y) {
		Utilidades.campo10.setBounds(x, y, 300, 40);
		return campo10;
	}

	public static JTextField getCampo11(int x, int y) {
		Utilidades.campo11.setBounds(x, y, 300, 40);
		return campo11;
	}

	public static JTextField getCampo12(int x, int y) {
		Utilidades.campo12.setBounds(x, y, 300, 40);
		return campo12;
	}

	public static JTextField getCampo13(int x, int y) {
		Utilidades.campo13.setBounds(x, y, 300, 40);
		return campo13;
	}
	
	public static JTextField getCampo14(int x, int y) {
		Utilidades.campo14.setBounds(x, y, 300, 40);
		return campo14;
	}

	public static void setTextField(){
		getCampo1().setText("");
		getCampo2().setText("");
		getCampo3().setText("");
		getCampo4().setText("");
		getCampo5().setText("");
		getCampo6().setText("");
		getCampo7().setText("");
		getCampo8().setText("");
		getCampo9().setText("");
		getCampo10().setText("");
		getCampo11().setText("");
		getCampo12().setText("");
		getCampo13().setText("");
		getCampo14().setText("");
	}

	public static JTextField getCampo1() {
		return campo1;
	}

	public static void setCampo1(JTextField campo1) {
		Utilidades.campo1 = campo1;
	}

	public static JTextField getCampo2() {
		return campo2;
	}

	public static void setCampo2(JTextField campo2) {
		Utilidades.campo2 = campo2;
	}

	public static JTextField getCampo3() {
		return campo3;
	}

	public static void setCampo3(JTextField campo3) {
		Utilidades.campo3 = campo3;
	}

	public static JTextField getCampo4() {
		return campo4;
	}

	public static void setCampo4(JTextField campo4) {
		Utilidades.campo4 = campo4;
	}

	public static JTextField getCampo5() {
		return campo5;
	}

	public static void setCampo5(JTextField campo5) {
		Utilidades.campo5 = campo5;
	}

	public static JTextField getCampo6() {
		return campo6;
	}

	public static void setCampo6(JTextField campo6) {
		Utilidades.campo6 = campo6;
	}

	public static JTextField getCampo7() {
		return campo7;
	}

	public static void setCampo7(JTextField campo7) {
		Utilidades.campo7 = campo7;
	}

	public static JTextField getCampo8() {
		return campo8;
	}

	public static void setCampo8(JTextField campo8) {
		Utilidades.campo8 = campo8;
	}

	public static JTextField getCampo9() {
		return campo9;
	}

	public static void setCampo9(JTextField campo9) {
		Utilidades.campo9 = campo9;
	}

	public static JTextField getCampo10() {
		return campo10;
	}

	public static void setCampo10(JTextField campo10) {
		Utilidades.campo10 = campo10;
	}

	public static JTextField getCampo11() {
		return campo11;
	}

	public static void setCampo11(JTextField campo11) {
		Utilidades.campo11 = campo11;
	}

	public static JTextField getCampo12() {
		return campo12;
	}

	public static void setCampo12(JTextField campo12) {
		Utilidades.campo12 = campo12;
	}

	public static JTextField getCampo13() {
		return campo13;
	}

	public static void setCampo13(JTextField campo13) {
		Utilidades.campo13 = campo13;
	}

	public static JTextField getCampo14() {
		return campo14;
	}

	public static void setCampo14(JTextField campo14) {
		Utilidades.campo14 = campo14;
	}

	

}
