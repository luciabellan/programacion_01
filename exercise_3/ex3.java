

import java.util.Scanner;

public class ex3 {

    public static void main (String[] args){
        int max = 20;
        int num;
       
        Scanner sc = new Scanner(System.in);
      
        
        System.out.println("Write a number from 1-20: ");
        num = sc.nextInt();
        
        
        for(int i=1; i<=num; i++){
            for(int j=1; j<=max; j++){
                System.out.println(j+" x "+i+" = "+j*i);
            }
        }
       
        sc.close();
        
        
    }
    
}