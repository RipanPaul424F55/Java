import java.util.Scanner;
public class PositionInsert
{
  public static void addElement(int [] a,int n,int e,int p)
  {
    for(int i=n;i>p;i--)
    {
      a[i]=a[i-1];
    }
    a[p]=e;
  }
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the range of the array : ");
    int n=obj.nextInt();
    int [] a=new int [(n+1)];
    System.out.println("fill up");
    for(int i=0;i<n;i++)
    {
      System.out.print("a["+i+"] ");
      a[i]=obj.nextInt();
    }
    System.out.println("Enter a value ");
    int e=obj.nextInt();
    System.out.println("Enter a valid position you want to insert that element");
    int p=obj.nextInt();
    if(p<n && p>-1)
    {
      System.out.println("before");
      for(byte i=0;i<n;i++)
      System.out.print(a[i]+" ");
      System.out.println();
      System.out.println("after");
      addElement(a,n,e,p);
      for(int i=0;i<=n;i++)
      System.out.print(a[i]+" ");
    }
    else
    {
      System.out.print("Out of range");
    }
  }
}
