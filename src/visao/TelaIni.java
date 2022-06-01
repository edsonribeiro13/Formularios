package visao;

import javax.swing.JPanel;

public class TelaIni extends JPanel{
    private static TelaIni painel = new TelaIni();

    public static TelaIni criarTela(){

        painel.setVisible(true);
		painel.setSize(790, 880);
		painel.setLayout(null);
		painel.setBackground(Utilidades.getColor());

        painel.add(Labels.getTitulo("Tela Inicial"));

		Labels.setLabelNull();

        return painel;

    }
}
