package questao3;

import eventos.FecharJanela;
import java.awt.Frame;

public class JanelaQ3 extends Frame {

    public JanelaQ3() {
        setVisible(true);
        setSize(600, 400);
        setTitle("Movimenta nodo: Questão 03");
        addWindowListener(new FecharJanela());
        PanelQ3 p = new PanelQ3();
        add(p);
        p.requestFocus();
    
    }
    
    public static void main(String[] args) {
        new JanelaQ3();
    }
    
}
