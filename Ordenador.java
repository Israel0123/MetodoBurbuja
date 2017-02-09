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
public class Ordenador {
    
    //metodo OrdenarBurbuja no devuelve nada y recibe el vector desde el main
    public void OrdenarBurbuja(int [] array)
    {
        int aux;///variable que sirve como auxiliar para guardar los valores del vector que se van comparando
        boolean cambios=false;///variable 
        
        while(true)
        {
            cambios=false;
            for(int i=1; i<array.length; i++)
            {
             if(array[i]<array[i-1])
             {
                 aux=array[i];
                 array[i]=array[i-1];
                 array[i-1]=aux;
                 cambios=true;
             }
            }
            if(cambios==false)
            break;
        }
        
        
        
    }
}
