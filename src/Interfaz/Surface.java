
package Interfaz;
import Clases.ArbolBinario;
import Clases.Nodo;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.util.HashMap;

public class Surface extends JPanel {

    private ArbolBinario miArbol;
    private HashMap posicionNodos = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;
    
    
    // Constructor
    public Surface(ArbolBinario miArbol){
          this.miArbol = miArbol;
          this.setBackground(Color.WHITE);
          this.setPreferredSize(this.getPreferredSize());
          posicionNodos = new HashMap();
          subtreeSizes = new HashMap();
          dirty = true;
          repaint();      
    }


    // Calcula lasposiciones de los respectivos subarboles y de cada nodo que forma parte de ese subarbol, para conocer en que posicion van dibujados los rectangulos representativos del arbol de la expresion
    private void calcularPosiciones() 
    {
         posicionNodos.clear();
         subtreeSizes.clear();
         Nodo root = this.miArbol.getRaiz();
         if (root != null) 
         {
             calcularTamañoSubarbol(root);
             calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
         }
    }
    
    // Calcula el tamaño de cada subarbol y lo agrega al objeto subtreeSizes de la clase de tipo HashMap que va a contener la coleccion de todos los subarboles que contiene un arbol
    
    private Dimension calcularTamañoSubarbol(Nodo n) 
    {
          if (n == null) 
              return new Dimension(0,0);
 
          Dimension ld = calcularTamañoSubarbol(n.getHijo_izq());
          Dimension rd = calcularTamañoSubarbol(n.getHijo_der());
          
          int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
          int w = ld.width + child2child + rd.width;
          
          Dimension d = new Dimension(w, h);
          subtreeSizes.put(n, d);
          
          return d;
    }
    
    
    // Calcula la ubicacion de cada subarbol y agrega cada nodo con un objeto de tipo Rectangle que tiene la ubicacion y la informacion especifica de donde va a ser dibujado
    private void calcularPosicion(Nodo n, int left, int right, int top) 
    {
      if (n == null) 
          return;
      
      Dimension ld = (Dimension) subtreeSizes.get(n.getHijo_izq());
      if (ld == null) 
          ld = empty;
      
      Dimension rd = (Dimension) subtreeSizes.get(n.getHijo_der());
      if (rd == null) 
          rd = empty;
      
      int center = 0;
      
      if (right != Integer.MAX_VALUE)
          center = right - rd.width - child2child/2;
      else if (left != Integer.MAX_VALUE)
          center = left + ld.width + child2child/2;
      int width = fm.stringWidth(n.getDato()+"");
 
      posicionNodos.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fm.getHeight()));
      
      calcularPosicion(n.getHijo_izq(), Integer.MAX_VALUE, center - child2child/2, top + fm.getHeight() + parent2child);
      calcularPosicion(n.getHijo_der(), center + child2child/2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }
    
    
    // Dibuja el arbol teniendo en cuenta las ubicaciones de los nodos y los subarboles calculadas anteriorment
    private void dibujarArbol(Graphics2D g, Nodo n, int puntox, int puntoy, int yoffs) 
    {
     if (n == null) 
         return;
     
     Rectangle r = (Rectangle) posicionNodos.get(n);
     g.draw(r);
     g.drawString(n.getDato()+"", r.x + 3, r.y + yoffs);
   
     if (puntox != Integer.MAX_VALUE)
       
     g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);
     
     dibujarArbol(g, n.getHijo_izq(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     dibujarArbol(g, n.getHijo_der(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     
     
   }
    
    // Sobreescribe el metodo paint y se encarga de pintar todo el arbol.
    @Override
   public void paint(Graphics g) 
   {
         super.paint(g);
         fm = g.getFontMetrics();

         if (dirty) 
         {
           calcularPosiciones();
           dirty = false;
         }
         
         Graphics2D g2d = (Graphics2D) g;
         g2d.translate(getWidth() / 2, parent2child);
         dibujarArbol(g2d, this.miArbol.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE, 
         fm.getLeading() + fm.getAscent());
         fm = null;
   }
   
 }
    

