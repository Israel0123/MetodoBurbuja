/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author isrm_
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo ={5,3,4,2};//declaracion del vector en donde se le asignan los valores 
        Ordenador o=new Ordenador();////se crea un objeto de la clase Ordenador para poder acceder al metodo OrdenarBurbuja
        o.OrdenarBurbuja(arreglo);///con el nombre del objeto se le realiza una referncia a OrdenarBurbuja y se le pasan los valorws del arreglo
        
        
        //for en el cual se imprime el arreglo ya ordenado por el metodo OrdenarBurbuja
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
        
    }
    
}
