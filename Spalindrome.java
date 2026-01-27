import java.util.Scanner;
public class Spalindrome
{
    public static boolean check(String s)
    {
        String s1="";
        int c=s.length()-1;
        while(c>=0)
        {
            s1=s1+s.charAt(c);
            c--;
        }
        if(s1.equals(s))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=obj.next();
        if(check(s)==true)
        System.out.print("String is palindrome");
        else
        System.out.print("String is not Palindrome");
    }
}