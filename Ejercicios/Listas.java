package proyectos_pilares.ejemplo1;


import java.util.ArrayList;
import java.util.List;


public class Ejemplo21 {
    
    public static void main(String[] args) {
        
        int LIMITE = 10;
        int resultado = 0;
        List lista = new ArrayList();
        
        for(int i = 0; i<=LIMITE-1; i= i+1){
            lista.add(i+1);
            
        }
        System.out.println(lista);
        for(int i = 0; i<lista.size(); i = i+1){
            resultado = resultado + (int)lista.get(i);    
        }
        System.out.println(resultado);
    }
    
    
}
