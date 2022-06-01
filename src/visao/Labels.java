package visao;

import javax.swing.JLabel;

public class Labels extends JLabel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel labelTitulo;
    private static JLabel labelRotulo;
    private static JLabel labelRotuloAux;

    public static JLabel getTitulo(String titulo){
        labelTitulo = new JLabel(titulo);
        labelTitulo.setFont(Utilidades.getFonteTitulo());
        labelTitulo.setBounds(180, 0, 500, 100);
        return labelTitulo;
    }

    public static JLabel getNomeLabel(String rotulo){
        labelRotuloAux = labelRotulo;
        labelRotulo = new JLabel(rotulo);
        labelRotulo.setFont(Utilidades.getFonteRotulo());
        if(labelRotuloAux != null)
            labelRotulo.setBounds(0, labelRotuloAux.getY() + 50, 200, 50);
        else
            labelRotulo.setBounds(0, 100, 200, 50);
        return labelRotulo;
    }

    public static int getLabelX(){ 
        return labelRotulo.getX();
    }

    public static int getLabelY(){
        return labelRotulo.getY();
    }

    public static void setLabelNull(){
        labelRotulo = null;
        labelTitulo = null;
    }

}
