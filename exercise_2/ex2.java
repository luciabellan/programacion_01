package exercise_2;


import java.util.Scanner;

public class ex2 {


    public static void main(String[] args) {
        
        int limInf = 0;
        int limSup = 30000;
        Scanner sc =  new Scanner(System.in);
        int limit2, limit1;

        
        
        int num;

        int sum=0;
        int total=0;

        int temp;
        int i;

        do{
            System.out.println("Inferior limit (between 0 and 30,000): ");
          limit1 = sc.nextInt();
          sc.close();
         
        }
        while(limit1 < limInf || limit1> limSup);

        do{
            System.out.println("Superior limit (between 0 and 30,000): ");
          limit2 = sc.nextInt();
          sc.close();
        }
        while(limit2 < limInf || limit2> limSup);


        if(limit2<limit1){
            temp = limit1;
            limit1= limit2;
            limit2= temp;
        }else{
           
        }

        do{
            System.out.println("Number to check: ");
            num= sc.nextInt();
            sc.close();
        } while(num < limit1 || num>limit2);

        System.out.println("multiple numbers of "+num+" in the interval ["+limit1+", "+limit2+"]: ");
        for(i=limit1; i<=limit2; i++){
            if(i%num==0){
                total = total +1;
                sum= sum+i;
                System.out.println(i);
            }
        }
        System.out.println("Total of numbers: "+total);
        System.out.println("Value of the sum: "+sum);

        sc.close();
        
    }
}