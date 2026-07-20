import java.util.*;
class addfnc
{
    public static int calculatesum(int a ,int b)//fnc declaration
    {
    int sum=a+b;//fnc definition(actual code)
    return sum;
}


public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum=calculatesum(a,b);//fnc call
    System.out.println("sum of two numbers is:"+ sum);

}
}