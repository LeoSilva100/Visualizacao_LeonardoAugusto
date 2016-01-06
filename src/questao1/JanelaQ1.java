package questao1;

import eventos.FecharJanela;
import java.awt.Frame;

public class JanelaQ1 extends Frame {

    public JanelaQ1() {
        setVisible(true);
        setSize(600, 400);
        setTitle("Desenho arvore binaria: Questão 01");
        addWindowListener(new FecharJanela());
        add(new PanelQ1());
    }
    
    public static void main(String[] args) {
        new JanelaQ1();
    }
    
}
