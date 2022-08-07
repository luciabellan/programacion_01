package exercise_4;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int n;
        String exit;
        float sum = 0;

        do{

            do{
                System.out.println("Write number from 0--60000");
                n= sc.nextInt();
            }while(n<=0 || n>60000);
            
            
            for(float i=1; i<=n; i++){
                
                sum += (i/(i+1));
                
            }
            System.out.println("Sum: "+sum);
            
            do{
                System.out.println("Exit? (Y/N)");
                exit = sc.next();
                exit = exit.toUpperCase();
            }
            while( (!exit.equals("Y") && !exit.equals("N") ));

        }while((!exit.equals("Y")));
        System.out.println("---End---");
        sc.close();
        System.out.close();
    }   
}
