
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Memoria {
    
    // Atributos
    
    private ArbolBinario arbol;
    private boolean adivinado;
    
    // Constructor
    
    public Memoria(ArbolBinario arbol){
        
        this.arbol = arbol;
        this.adivinado = false;
        
    }
    
    // Getters and Setters

    public ArbolBinario getArbol() {
        return arbol;
    }

    public void setArbol(ArbolBinario arbol) {
        this.arbol = arbol;
    }

    public boolean isAdivinado() {
        return adivinado;
    }

    public void setAdivinado(boolean adivinado) {
        this.adivinado = adivinado;
    }
    
    // Funciones y Metodos
    
    public boolean si(String pregunta){
        // Hace una pregunta y solo acepta como respuesta Si o No
        
        int dialogButton = JOptionPane.showConfirmDialog(null, pregunta + "?", "Opcion", JOptionPane.YES_NO_OPTION, 1);

        if (dialogButton == JOptionPane.YES_OPTION) {

            return true;
        }
        else{

            return false;
        }
        
    }
    
    public void Iniciar(){
        // Metodo base de recorrer el arbol e ir preguntando al usuario
        boolean bucle = true;
        adivinado = false;
        
        while(bucle){
        
            if(!si("Estas pensando en un animal")){
            
                JOptionPane.showMessageDialog(null, "           Hasta Pronto!!");
                break;
            
            }
        
            else{
            
                this.Preguntar(arbol.getRaiz());
                
                // Si se adivina el animal se sale del bucle y por ende del programa
                if (adivinado) {
                    
                    bucle = false;
                }
                
            }
        }
        
    }
    
    public boolean Preguntar(Nodo n){
        // Recorre cada Nodo del arbol, preguntando al usuario lo que se encuentre en el nodo
        if (n.getHijo_izq() != null) {
            // Recorrera el arbol hasta llegar a un nodo sin hijos    
            if (this.si( (String) n.getDato() )) {
                    
                this.Preguntar(n.getHijo_der());
            }
            else{
                
                this.Preguntar(n.getHijo_izq());
            }
                
        }
        else{
            // Al llegar a un nodo sin hijos quiere decir que es un animal, por ende pregunta al usuario si ese es el animal que estaba pensando
            if (!(this.Adivinar( (String) n.getDato() ))) {
                // Si no logra adivinar el animal, le hace preguntas al usuario para aprender sobre el animal que estaba pensando
                this.Aprender( (String) n.getDato() );
                
            }
               
        }
        
        return false;
    }
    
    public boolean Adivinar(String animal){       
        // Le pregunta al usuario una vez encontrado el nodo del animal
        if( si("Es un/una " + animal)){
            
            JOptionPane.showMessageDialog(null, "    SOY EL MAS GRANDE!!");
            
            adivinado = true;
            
            return true;
            
        }
        
        return false;
        
    }
    
    public void Aprender(String animal){
        // Hace preguntas al usuario para poder aprender sobre el animal que no estaba en la base de datos
        
        String nuevoAnimal = JOptionPane.showInputDialog(null, "Que animal era?");
        
        if (nuevoAnimal == null) {
            
            while(nuevoAnimal == null){
            
                JOptionPane.showMessageDialog(null, "Ingrese un animal");
                
                nuevoAnimal = JOptionPane.showInputDialog(null, "Que animal era?");
            }
            
        }
        
        String condicion = JOptionPane.showInputDialog(null, "Qué diferencia a un " + animal + " de un " + nuevoAnimal + "? ");
        
        if (condicion == null) {
            
            while(condicion == null){
            
                JOptionPane.showMessageDialog(null, "Ingrese que los diferencia");
                
                condicion = JOptionPane.showInputDialog(null, "Qué diferencia a un " + animal + " de un " + nuevoAnimal + "? ");
            }
            
        }
            
        String indicador = "Si el animal fuera un " + animal + " cual seria la respuesta";
           
        Nodo nodoAReemplazar = arbol.find(arbol.getRaiz(), animal);
        
        String datoAReemplazar = (String) nodoAReemplazar.getDato();
        
        nodoAReemplazar.setDato(condicion);
        
        // los nodos de la izquierda son respuestas a Si
        if (this.si(indicador)) {
            
            arbol.insertRight(condicion, datoAReemplazar);
            
            arbol.insertLeft(condicion, nuevoAnimal);
        }
        // los nodos de la derecha son respuestas a No
        else{
            
            arbol.insertRight(condicion, nuevoAnimal);
            
            arbol.insertLeft(condicion, datoAReemplazar);
        }
       
    }
    
    public void BorrarMemoria(){
    
        this.arbol.setRaiz(new Nodo("Pajaro"));
    }
    
    public JPanel getDibujo() {
        return this.arbol.getdibujo();
    }
}
