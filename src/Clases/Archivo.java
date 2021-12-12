
package Clases;

import static Clases.Proyecto_II.arbol;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Archivo {

    String path;
    
    public Archivo(){
    
        this.path = "test\\ProyectoII.txt"; // DIRECCION DEL ARCHIVO
    }
    
    public ArbolBinario CargarArbol(String path){
        
        String linea;
        String lector="";
        String [] arreglo;
        String [][] matriz;
        
        ArbolBinario arbol = new ArbolBinario();
        
        try{
            
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
                
            while((linea = br.readLine())!= null){
                
                if(!linea.isEmpty()){
                    
                    lector += linea+"\n";
                }
            }
                
            if("".equals(lector)){
               
                System.out.println("No hay nada");
                
                return null;
            }
    
            arreglo = lector.split("\n");
                
            matriz= new String [arreglo.length][3];
                
            for (int i = 0; i < arreglo.length; i++) {
                    
               matriz[i] = arreglo[i].split(";");
            }
            
             Nodo temp;
            
            for (int i = 0; i < arreglo.length; i++) {
                                
                if(i == 0){
                
                    arbol.setRaiz(new Nodo(matriz[i][0]));
                    
                    temp =arbol.getRaiz();
                }
                
                else{
                
                    temp = arbol.find(arbol.getRaiz(),matriz[i][0]);
                }
                
                if(!matriz[i][1].equalsIgnoreCase("null115")){
                        
                    temp.setHijo_izq(new Nodo(matriz[i][1]));
                }
                    
                else{
                    
                    temp.setHijo_izq(null);
                }
                    
                if(!matriz[i][2].equalsIgnoreCase("null115")){
                        
                    temp.setHijo_der(new Nodo(matriz[i][2]));
                }
                    
                else{
                    
                    temp.setHijo_der(null);
                }
            }
            
        }catch(IOException error){
             JOptionPane.showMessageDialog(null, "Hubo un error: "+error.getMessage());
             
             return null;
        }
        
        return arbol;
    }

    public void GuardarArbol(ArbolBinario arbol){
    
        String path = "C:\\Users\\yosel\\OneDrive\\Documentos\\Proyecto\\ProyectoII.txt";
        
        try{
            File archivo = new File(path);
                
            System.out.println("Se ha guardado el archivo.");
            
            PrintWriter pw = new PrintWriter(path);
            
            pw.print("");
                        
            pw.append(PreOrdenAux(arbol));
            pw.close();
        
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, "Hubo un error: "+error.getMessage());
        }
    }
    
    private String PreOrdenAux(ArbolBinario arbol){
    
        if(arbol.getRaiz() !=null){
        
            return PreOrderAux(arbol.getRaiz(),"");
        }
        
        return "No se ha encontrado nada";
    }
    
    private String PreOrderAux(Nodo nodo,String mensaje){
    
        if(nodo != null){
        
            mensaje += nodo.getDato()+";";
            
            if(nodo.getHijo_izq() != null){
            
                mensaje +=nodo.getHijo_izq().getDato()+";";
            }
            
            else{
        
                mensaje += "null115;";
            }
            
            if(nodo.getHijo_der() != null){
            
                mensaje +=nodo.getHijo_der().getDato();
            }
            
            else{
        
                mensaje += "null115;";
            }
            
            mensaje +="\n";
            
            mensaje =PreOrderAux(nodo.getHijo_izq(),mensaje);
            mensaje =PreOrderAux(nodo.getHijo_der(),mensaje);
        }
        
        return mensaje;
    }
    
    public ArbolBinario Inicializar(){
    
        File archivo = new File(this.path);
        if (!archivo.exists()) {
            Memoria memoria = new Memoria(arbol);
            memoria.BorrarMemoria();
            System.out.println("Se ha creado el archivo");
            this.GuardarArbol(arbol);
            
            arbol = this.CargarArbol(this.path);
            
        }
        else{
        
            arbol = this.CargarArbol(this.path);
            System.out.println("Se ha cargado el Archivo correctamente");
            
            return arbol;
        }
        
        return arbol;
    }
    
}
