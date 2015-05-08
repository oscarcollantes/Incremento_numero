/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package incremento.de.nros;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class IncrementoDeNros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in1=new Scanner(System.in);
        System.out.print("Numero X : ");
        int  x= in1.nextInt();
        Scanner in2=new Scanner(System.in);
        System.out.print("Numero Y : ");
        int y= in2.nextInt(); 
     if(x<y){   
        for(int i=0;i<y;i++)
            
         System.out.print(i+1);}
            
        else
        { 
            if(y<x){
            for(int i=y-1;i<x;i++)
                    System.out.print(i+1);}   
    }
}     
}
