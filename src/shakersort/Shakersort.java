/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shakersort;

/**
 *
 * @author guada
 */
public class Shakersort {

    public static  int izquierda, derecha, ultimo;
    
    public static void main(String[] args) {
        
        int arreglo[]={34,56,66,8};
        System.out.println("desordenado");
        for(int i=0; i< arreglo.length;i++){
            
            System.out.println(arreglo[i] + "");
        }
        System.out.println(" ");
        izquierda = 1;
        derecha = arreglo.length;
        ultimo = arreglo.length - 1;
        
       do{
           for (int i = arreglo.length -1; i > 0; i--){
               
               if (arreglo[i-1]>arreglo[i]){
                   int aux =arreglo[i];
                   arreglo[i]= arreglo[i -1];
                   arreglo[i -1] = aux;
                   ultimo = i;
               }
           }
           izquierda =ultimo + 1;
           for(int j = 1; j< arreglo.length; j++){
               if(arreglo[j-1]>arreglo[j]){
                   int aux = arreglo[j];
                   arreglo[j] = arreglo[j-1];
                   arreglo[j-1] = aux;
                   ultimo = j;
           }
           }
       
       derecha = ultimo -1;
       }while (derecha >= izquierda);
    System.out.println("ordenado");
    for (int i = 0; i < arreglo.length; i++){
    
            System.out.println(arreglo[i] +" ");
    
}
       }
       }


