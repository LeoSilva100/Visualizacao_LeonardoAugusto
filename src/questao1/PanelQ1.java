package questao1;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ1 extends Panel {

    @Override
    public void paint(Graphics g) {
        this.desenhaNodo(g, 30, 300,50);
        
    }
    private void desenhaNodo(Graphics g, int key, int x, int y) {
        //desenhe o nodo aqui
        g.drawOval(x, y, 30, 30);
        g.drawString("10", x+8, y+18);
       
    }
     /**
     * Metodo privado para desenho de nodo;
     * utilize este metodo para desenhar um nodo dado um valor e suas coordenadas
     * x e y.
     * @param g contexto grafico
     * @param key valor que ficara no centro do nodo
     * @param x coordenada x da localizacao do nodo
     * @param y coordenada y da localizacao do nodo
     */
    
}
