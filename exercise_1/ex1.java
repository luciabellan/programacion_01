package exercise_1;

import java.util.Scanner;

//Realizar un programa que permita leer N números enteros de teclado y obtener su suma. 
//El valor N será una constante 
public class ex1 {
    public static void main(String[] args) {
        int N = 10;
        int num, cuantos;
        float suma = 0;
        
        cuantos =1;
        Scanner sc = new Scanner(System.in);
       
        while(cuantos<=N){
            System.out.println("Introduzca valor: ");
            
           
                num = sc.nextInt();
                suma += num;
                cuantos++;
                
            }
        System.out.println("Suma= "+suma);
        sc.close();
    }
}
