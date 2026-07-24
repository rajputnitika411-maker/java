import java.util.*;
public class Str {
    public static void main(String args[])
    {
        //concatenation
        /*String firstName="nitika";
        String lastName="rajput";
        String fullname=firstName+" "+lastName;*/

        //length
        /*System.out.println(fullname.length());

                // charAt
               for(int i=0;i<fullname.length();i++)
             {
                   System.out.println(fullname.charAt(i));
                }*/

         //compare
         //1. s1>s2:+ve
         //2. s1<s2:-ve
         //3. s1==s2:0
         String name1="nitika";
         String name2="nitika";
         if(name1.compareTo(name2) ==0){
            System.out.println("strings are equal");
         }
         else{
            System.out.println("strings are not equal");
         }


    }
}