
package Clases;

public class Nodo {
    
    // Atributos
    
    private Nodo hijo_izq;
    private Nodo hijo_der;
    private Object dato;
    private int x;
    private int y;
    private int d;
    
    // Constructor Nodo
    
    public Nodo(Object dato){
    
        this.hijo_der = null;
        this.hijo_izq = null;
        this.dato = dato;
        this.x = 10;
        this.y = 10;
        this.d = 50;
    }
    
    // Getters and Setters

    public Nodo getHijo_izq() {
        return hijo_izq;
    }

    public void setHijo_izq(Nodo hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    public Nodo getHijo_der() {
        return hijo_der;
    }

    public void setHijo_der(Nodo hijo_der) {
        this.hijo_der = hijo_der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
    // Funciones y Metodos
    
    public void MostrarNodo(Nodo n) {
        
        System.out.print(n.dato + " ");
    }
    
}
