import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a number = ");
        num = sc.nextInt();

       

        if (num%2==0){
            System.out.println("this is even number");
          }

        else {
            System.out.println("it is odd number");

            sc.close();
        }




    }



}
    

