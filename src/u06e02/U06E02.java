
package u06e02;

import java.util.Scanner;

public class U06E02{

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[5];
        for(int i=0; i<valores.length; i++){
            System.out.print("Ingrese un número al array: ");
            valores[i]=entrada.nextInt();
        }
        imprimeArray(valores);
    }
    static void imprimeArray (int[] a){
        int x=0;
        for(x=0; x<a.length; x++){
            System.out.println("El "+(x+1)+"° valor es: "+a[x]);
        }
    }
}