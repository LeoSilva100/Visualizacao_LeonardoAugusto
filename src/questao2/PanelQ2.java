package questao2;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ2 extends Panel {
    
    public void paint(Graphics g) {
       
        
    
        g.drawOval(300, 50, 30, 30);
        g.drawString(String.valueOf(5),310,70);
        g.drawLine(310, 80, 280, 110);
        g.drawLine(320, 80, 350, 110);
        g.drawOval(260, 110, 30, 30);
        g.drawString(String.valueOf(2),270,130);
        
        g.drawOval(210,160,30,30);
        g.drawLine(272, 140, 232, 160);
        g.drawLine(270, 140, 300, 170);
        g.drawString(String.valueOf(-4),218,180);
        g.drawOval(300,160,30,30);
        g.drawString(String.valueOf(3),313,180);
        g.drawOval(340, 110, 30, 30);
        g.drawString(String.valueOf(18),350,130);
        
        
       
       
       
        
    }
    
    
     /**
     * Esta classe deve ser modificada para realizar o desenho da arvore binaria
     * solicitada na questao 01
     * @param g - contexto grafico
     */
    
}
