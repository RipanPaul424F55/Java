import java.util.Scanner;
public class PositionInsertString
{
  public static void addElement(String [] a,byte n,String s,byte p)
  {
    for(byte i=n;i>p;i--)
    a[i]=a[i-1];
    a[p]=s;
  }
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the range of the array : ");
    byte n=obj.nextByte();
    String [] a =new String [(n+1)];
    System.out.println("Fil up");
    for(byte i=0;i<n;i++)
    {
      System.out.print("a["+i+"] ");
      a[i]=obj.next();
    }
    System.out.print("Enter new String ");
    String s=obj.next();
    System.out.println("Enter a valid position you want to insert that string");
    byte p=obj.nextByte();
    if(p>=n)
    System.out.println("Range error");
    else
    {
      System.out.println("before");
      for(byte i=0;i<n;i++)
      System.out.print(a[i]+" ");
      addElement(a,n,s,p);
      System.out.println();
      System.out.println("After");
      for(byte i=0;i<=n;i++)
      System.out.print(a[i]+" ");
    }
  }
}
