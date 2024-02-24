package pilas.y.colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author NestorAlejandroFandi
 */
public class PilasYColas {


    public static void main(String[] args) {

        Queue <String> queue = new LinkedList<>(); 
        
        Stack <String> stack = new Stack<>();
      
        //Añade las marcas de los vehiculos a la cola o queue
        System.out.println("COLAS");
            
            queue.add("Ferrari");
            queue.add("Toyota");
            queue.add("Mazda");
            queue.add("BMW");
            queue.add("Susuki");
  
        //Muestra el contenido del queue o la cola
         LinkedList<String> ultimo = new LinkedList<>(queue); 

        System.out.println("El cuerpo de esta cola es: "+queue);
        int size = queue.size();
        
       
        System.out.println("El tamaño de la cola es: "+size);
        System.out.println("");
        
        //Elimina el head de la cola
        
        String head = queue.remove();
        //String head4 = queue.poll();
        System.out.println("La Cabeza de la cola es: "+head); 
        System.out.println("El ultimo de la cola es "+ultimo.getLast());
        System.out.println("");
        
        
        System.out.println("Elementos de la cola despues del metodo remove");
            
        System.out.println("La Cabeza de la cola ahora es: "+queue.peek());
        
        System.out.println("Elementos de la cola: "+queue);
        System.out.println("");
        System.out.println("");
        
      
        
        System.out.println("PILAS");
            
            stack.add("Manzana");
            stack.add("Pera");
            stack.add("Naranja");
            stack.add("Limon"); 
            stack.add("Guayaba");
            
 
        //Muestra los elementos de la pila
        System.out.println("Elementos de la pila "+stack);
        int size2 = stack.size();
        System.out.println("El tamaño de la pila es: "+size2);
        System.out.println("");
        
        //Eliminamos el head del stack
       
        System.out.println("El head de la pila es: "+stack.firstElement());
        System.out.println("El ultimo elemento es: "+stack.lastElement());
        System.out.println("Elementos de la pila despues del metodo pop");
        
       
        
        
        System.out.println("Nueva head: "+stack.peek());
        
        System.out.println("Nuevos elementos de la pila: "+stack);
    }
    
}

        
        
    
    

