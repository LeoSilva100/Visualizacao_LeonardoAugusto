package questao3;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ3 extends Panel {
    
    protected int nodox = 50;
    protected int nodoy = 50;

    public PanelQ3() {
        addKeyListener(new EventoMovimentaNodo(this));
    }
 
    public void paint(Graphics g) {
          this.desenhaNodo(g, 10, nodox, nodoy);     
    }
    private void desenhaNodo(Graphics g, int key, int x, int y) { 
       
       g.drawOval(x,y,50,50);
       g.drawString(String.valueOf(key),nodox+16,nodoy+26);
    }
    
}
