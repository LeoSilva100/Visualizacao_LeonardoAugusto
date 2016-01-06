package questao4;

import java.awt.Graphics;

public class BinaryTree {

    //raiz da arvore
    protected Node root;
    
    //construtor que cria uma arvore com um nodo raiz
    public BinaryTree(int data) {
        root = new Node(data);
    }

    // metodo publico para adicao de nodos
    public void add(int key) {
        this.addNode(this.root, key);
    }
    
    /**
     * metodo privado responsavel por adicionar os nodos na arvore binaria,
     * este e um metodo recursivo, que a partir de um nodo pai, verifica se o valor 
     * a ser adicionado é menor ou maior que o valor do nodo pai, se o valor key
     * for menor que o valor do nodo pai, tenta-se adicionar o valor a esquerda 
     * do nodo pai, se for maior, tenta-se adicionar o valor a direita.
     * @param node - nodo pai, aonde o valor key deve ser adicionado como um de seus nodos filhos
     * @param key  - valor a ser adicionado no nodo
     */
    private void addNode(Node node, int key) {
        if (key < node.getKey()) {
            if (node.getLeft() != null) {
                addNode(node.getLeft(), key);
            } else {
                System.out.println("  Inserted " + key + " to left of "
                        + node.getKey());
                node.setLeft(new Node(key));
            }
        } else if (key > node.getKey()) {
            if (node.getRight() != null) {
                addNode(node.getRight(), key);
            } else {
                System.out.println("  Inserted " + key + " to right of "
                        + node.getKey());
                node.setRight(new Node(key));
            }
        }
    }

    /**
     * metodo que realiza o desenho da arvore
     * @param g - contexto grafico
     */
    public void paint(Graphics g) {
        this.paintNode(g, root, 300, 10);
    }
    
    /**
     * metodo privado que realizar o desenho da arvore atravez de chamadas recursivas.
     * Cada nodo e desenhado e se houver um nodo a esquerda ou direita, o metodo
     * e chamado novamente para realizar o desenho de todos os nodos.
     * @param g - contexto grafico
     * @param node - nodo a ser desenhado
     * @param x - posicao x aonde o nodo deve ser desenhado
     * @param y - posicao y onde o nodo deve ser desenhado
     */
    private void paintNode(Graphics g, Node node, int x, int y) {
        //implemente o metodo recursivo para desenho dos nodos aqui
            
         desenhaNo(g, String.valueOf(node.getKey()), x, y);
         
        if (node.getLeft() != null) {
            desenhalin(g, x, y, x - 30, y + 50);
            desenhaNo(g, String.valueOf(node.getLeft().getKey()), x - 60, y + 40);
            paintNode(g, node.getLeft(), x - 60, y + 40);
        }
        if (node.getRight() != null) {
            desenhalin(g, x + 20, y, x + 50, y + 50);
            desenhaNo(g, String.valueOf(node.getRight().getKey()), x + 50, y + 40);
            paintNode(g, node.getRight(), x + 50, y + 40);
        }
    }
    private void desenhaNo(Graphics g, String key, int x, int y) {
        g.drawString(key, x + 10, y + 20);
        g.drawOval(x, y, 30, 30);
    }
    private void desenhalin(Graphics g, int x, int y, int x2, int y2) {
        
        g.drawLine(x + 4, y + 23, x2, y2);
    }
       
    
    
    /**
     * metodo utilizado para fazer o percorrimento da arvore
     */
    public void traverse() {
        this.printNode(root);
    }
    
    /**
     * metodo privado que realiza o percorrimento da arvore de forma recursiva;
     * @param node - no atual que sera escrito na tela
     */
    private void printNode(Node node) {
        System.out.println(node.getKey());
        if (node.getLeft() != null) {
            printNode(node.getLeft());
        }
        if (node.getRight() != null) {
            printNode(node.getRight());
        }
    }

}
