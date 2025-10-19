import java.util.*;
class SmallestInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        for(int x=0; x<5;x++)
        {
            System.out.println("Enter any 5 number");
            a[x]=sc.nextInt();
        }
        int min=a[0];
        for(int x=1; x<5 ;x++)
        {
            if (a[x]<min)
            {
               min=a[x];
            }
        }
        System.out.println("Smallest no =" +min);
    }
}

