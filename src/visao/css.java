package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class css {

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

    public static JTextField getCampodeTexto(int x, int y){
        final JTextField campo = new JTextField();
        campo.setBounds(x, y + 10, 200, 30);
        return campo;
    }

}
