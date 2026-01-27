import java.util.Scanner;
public class exception
{
	public static int division(int a,int b)
	{
		try
		{
			return a/b;
		}
		catch(Exception e)
		{
			System.out.print("Error occured '"+e.getMessage()+"'");
			return 0;
		}
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter First number:");
		int a=obj.nextInt();
		System.out.print("Enter second number:");
		int b=obj.nextInt();
		int x=division(a,b);
		System.out.print("\nafter division, the result is "+x);
	}
}
