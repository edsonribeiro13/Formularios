package visao;

import javax.swing.JLabel;

public class Labels extends JLabel {
    private static JLabel labelTitulo;
    private static JLabel labelRotulo;
    private static JLabel labelRotuloAux;

    public static JLabel getTitulo(String titulo){
        labelTitulo = new JLabel(titulo);
        labelTitulo.setFont(css.getFonteTitulo());
        labelTitulo.setBounds(180, 0, 400, 100);
        return labelTitulo;
    }

    public static JLabel getNomeLabel(String rotulo){
        labelRotuloAux = labelRotulo;
        labelRotulo = new JLabel(rotulo);
        labelRotulo.setFont(css.getFonteRotulo());
        if(labelRotuloAux != null)
            labelRotulo.setBounds(0, labelRotuloAux.getY() + 50, 200, 50);
        else
            labelRotulo.setBounds(0, 100, 200, 50);
        return labelRotulo;
    }

    public static void setLabelNull(){
        labelRotulo = null;
    }

}
