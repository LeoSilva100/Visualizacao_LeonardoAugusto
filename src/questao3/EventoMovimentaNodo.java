package questao3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventoMovimentaNodo extends KeyAdapter {

    PanelQ3 panel;
    
    
    public EventoMovimentaNodo(PanelQ3 p) {
        this.panel = p;
       
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
        this.panel.nodoy+=5;
        }
        
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){   
        this.panel.nodox+=5;
       
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
        this.panel.nodoy-=5;
       
        }
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT){   
        this.panel.nodox-=5;
        
        }
        this.panel.repaint();
        System.out.println(e);
    
}
}
