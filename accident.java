

import java.util.Scanner;
public class accident
{
    
	public static void main(String[] args)
	{
        int b=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of days the data has been collected for : ");
        int x= in.nextInt();
        int a[]= new int[x];
        double c[]=new double[x];
        for (int i=0;i<x;i++)
        {
            System.out.println("Enter the number of accidents on day "+(i+1)+" : ");
            a[i]=in.nextInt();
            b=b+a[i];
        }
        double m=b/x;
        System.out.println("The mean is: "+m);
        for (int i=0;i<x;i++)
        {
            c[i]=Math.abs(a[i]-m);
            System.out.println("The deviation from the mean on day "+(i+1)+" is : "+c[i]);
        }
    }
}
