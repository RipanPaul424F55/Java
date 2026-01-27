import java.util.Scanner;
class node
{
    String s;
    node next=null,prev=null;
    public node(String s)
    {
        this.s=s;
    }
}
class stack
{
    public static node tos=null;
    public static int count=-1;
    public static void insert()
    {
        Scanner obj=new Scanner(System.in);
        if(tos==null)
        {
            System.out.print("Enter element:");
            tos=new node(obj.next());
            count++;
        }else if(count<5){
            System.out.print("Enter value:");
            tos.next=new node(obj.next());
            tos.next.prev=tos;
            tos=tos.next;
            count++;
        }
        else
        System.out.println("stack is overflowes");
    }
    public static void delete()
    {
        if(tos==null)
        System.out.println("Stack is empty...");
        else
        {
            System.out.println("Element removed:'"+tos.s+"'");
            tos=tos.prev;
        }
    }
    public static void display()
    {
        if(tos==null)
        System.out.println("Stack is empty...");
        else{
            node temp=tos;
            System.out.print("The elements :");
            while(temp!=null)
            {
                System.out.print("'"+temp.s+"' ");
                temp=temp.prev;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        do{
            System.out.print("1 for insertion,2 for deletion 3 for display:");
            int n=obj.nextInt();
            if(n==1)
            insert();
            else if(n==2)
            delete();
            else if(n==3)
            display();
            else
            System.out.print("Invalid input...");
            System.out.print("q for quit,rest for continue:");
        }while(obj.next().charAt(0)!='q');
    }
}