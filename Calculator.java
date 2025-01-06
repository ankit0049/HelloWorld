import java.util.*;

class Calculator{ 

    private static int Addition(int n1 , int n2 , int n3)
    {
        return n1 + n2 + n3 ;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

          System.out.println("Welcome to calculator"); 
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt(); 

         int AdditionAnswer = Addition(num1 , num2 , num3);

         System.out.println("Addition of Nmber is :"+ AdditionAnswer);

    }
}