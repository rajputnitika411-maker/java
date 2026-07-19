import java.util.*;
    class calculator{
     public static void main( String[]args)
     
     {Scanner sc = new Scanner(System.in);

     System.out.print("enter first no:");
     int a= sc.nextInt();
     System.out.print("enter second no");
     int b= sc.nextInt();
      
    System.out.println("choose operation:");
    System.out.println("1. Addition(+)");
    System.out.println("2. subtraction(-)");
    System.out.println("3. multiplication(*)");
    System.out.println("4.division(/)");

    int choice = sc.nextInt();

    switch(choice)
    {
        case 1: System.out.println("addition=" +(a+b));
        break;
         case 2: System.out.println("subtraction=" +(a-b));
        break;
         case 3: System.out.println("multiplication=" +(a*b));
        break;
         case 4: 
         if(b!=0)
         System.out.println("division=" +(a/b));
         else
        System.out.println("cannot divide by zero");
        break;
        default:
            System.out.println("invalid choice");
    }
    sc.close();

    }

     }

