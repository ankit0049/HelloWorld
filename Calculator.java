import java.util.*;

class Calculator{ 

    private static int Addition(int n1 , int n2 , int n3)
    {
        return n1 + n2 + n3 ;
    } 

    private static int Substraction(int n1 , int n2 , int n3)
    {
        return n1 - n2 - n3 ;
    }  

    private static int Multiplication(int n1 , int n2 , int n3)
    {
        return n1 * n2 * n3 ;
    }  

    private static int Division(int n1 , int n2 , int n3)
    {
        return ( (n1 / n2) / n3 ) ;
    } 


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

          System.out.println("Welcome to calculator"); 
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt(); 

         int AdditionAnswer = Addition(num1 , num2 , num3);

         System.out.println("Addition of Number is :"+ AdditionAnswer); 

         int SubstractionAnswer = Substraction(num1 , num2, num3);

         System.out.println("Substraction of Number is :"+ SubstractionAnswer); 

         int MultiplicationAnswer = Multiplication(num1 , num2, num3);

         System.out.println("Multiplication of Number is :"+ MultiplicationAnswer); 

         int DivisionAnswer = Division(num1 , num2, num3);

         System.out.println("Division of Number is :"+ DivisionAnswer);

    }
}