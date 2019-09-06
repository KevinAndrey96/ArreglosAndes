/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class Andes {

    /**
     * @param args the command line arguments
     */
    static String solve(int arreglo[], int x)
    {
        String rta="No se llegó a una solución";
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(arreglo[i]+arreglo[j]==x)
                {
                    rta="Se encontró la solución en los indices "+i+" y "+j;
                    break;
                }
            }
        }
        return rta;
    }
    public static void main(String[] args) {
        
        int[] ARREGLO = new int[10];
        
        String valores="";
        //Llenar arreglo
        for(int i=0;i<10;i++)
        {
            ARREGLO[i]=(int) (Math.random() * 99) + 1;
            valores+=" "+ARREGLO[i];
        }
        JOptionPane.showMessageDialog(null, valores);
        int X=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de X"));
        JOptionPane.showMessageDialog(null, solve(ARREGLO, X));
        JOptionPane.showMessageDialog(null, valores);
    }
    
}
