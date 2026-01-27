import java.util.Scanner;
public class MatrixMin
{
  public static int min(int [] x,byte y)
  {
    int temp=9999;
    for (byte a=0;a<y;a++)
    {
      if(temp>x[a])
      temp=x[a];
    }
    return temp;
  }
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    byte row,column;
    int [][] a = new int [10][10];
    int [] temp = new int[10];
    System.out.print("Enter the number of column : ");
    column=obj.nextByte();
    System.out.print("Enter the number of rows : ");
    row=obj.nextByte();
    System.out.println();
    for(byte i=0;i<row;i++)
        for(byte j=0;j<column;j++)
        {
          System.out.print("a["+i+"]["+j+"]  :  ");
          a[i][j]=obj.nextInt();
        }
    System.out.println("\n\t\t\tThe matrix");
    for(byte i=0;i<row;i++)
    {
      for(byte j=0;j<column;j++)
      System.out.print("   "+a[i][j]);
      System.out.print("\n\n\n");
    }
    System.out.print("\nRow wise mins : ");
    for(byte i=0;i<row;i++)
    {
      for(byte j=0;j<column;j++)
         temp[j]=a[i][j];
      System.out.print(min(temp,column)+"  ");
    }
  System.out.println("\nColumn wise mins : ");
  for(byte i=0;i<column;i++)
  {
    for(byte j=0;j<row;j++)
       temp[j]=a[j][i];
    System.out.println(min(temp,row));
  }
}
}
