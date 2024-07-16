package proyectos_pilares.ejemplo1;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo41 {
    public static void main(String[] args) {
        
        final int LIMITE = 5;
        
        Map<Integer,Boolean> mapaDePares = new HashMap<>();
        
        for(int i = 0; i < LIMITE; i = i + 1){
           
            if((i+1)%2 == 0) {
                mapaDePares.put(i+1,true);
            }else{
                mapaDePares.put(i+1,false);
            }
        }
        
        System.out.println(mapaDePares);
    }
}
