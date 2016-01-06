package questao4;

import eventos.FecharJanela;
import java.awt.Frame;

public class JanelaQ4 extends Frame {

    public JanelaQ4() {
        setVisible(true);
        setSize(600, 400);
        setTitle("Desenha arvore dinamica: Questão 04");
        addWindowListener(new FecharJanela());
        add(new PanelQ4());
    }
    
    public static void main(String[] args) {
        new JanelaQ4();
    }
    
}
