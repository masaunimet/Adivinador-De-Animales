
package Clases;

import Interfaz.Surface;
import javax.swing.JPanel;


public class ArbolBinario {
    
    // Atributos
    
    private Nodo raiz;
    
    // Constructor
    
    public ArbolBinario(){
    
        this.raiz = null;
    }
    
    // Getters and Setters

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    // Funciones y Metodos
    
    public boolean vacio(Nodo n){
        
        return n == null;
    }
    
    public void insertLeft(Object padre, Object valorIzq) {
	
        Nodo n = find(raiz, padre);
	
        Nodo hijo_izq = new Nodo(valorIzq);
	
        n.setHijo_izq(hijo_izq);
    }

    public void insertRight(Object parent, Object rightvalue) {
	
        Nodo n = find(raiz, parent);
	
        Nodo hijo_der = new Nodo(rightvalue);
	
        n.setHijo_der(hijo_der);
    }

    public void insertRoot(Object dato) {
	
        raiz = new Nodo(dato);
    }
 
    public Nodo find(Nodo n, Object key) {
	
        Nodo resultado = null;
	
        if (n == null)
            return null;
	
        if (n.getDato() == key || n.getDato().equals(key)) //<--Esta es la linea que cambie
            return n;
	
        if (n.getHijo_izq() != null)
            resultado = find(n.getHijo_izq(), key);
        
        if (resultado == null)
            resultado = find(n.getHijo_der(), key);
        
        return resultado;
    }
    
    
    public int getheight(Nodo root) {
	if (root == null)
            return 0;
	return Math.max(getheight(root.getHijo_izq()), getheight(root.getHijo_der())) + 1;
    }
    
    public void PreOrder(Nodo n ){
		
	if (n == null)
            return;
	n.MostrarNodo(n);
	PreOrder(n.getHijo_izq());
	PreOrder(n.getHijo_der());
    }
    
    // Dibuja en la interfaz
    public JPanel getdibujo() {
        return new Surface(this);
    }
    
}
