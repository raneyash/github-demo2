import java.util.*;
public class Functions
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        n1=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        n2=sc.nextInt();

        System.out.println();
        System.out.println("The answers are as follows:");
        System.out.println("LCM of "+n1+" and "+n2+" is: "+findLcm(n1,n2));
        System.out.println("GCD of "+n1+" and "+n2+" is: "+findGcd(n1,n2));
    }

    static int findGcd(int n1, int n2)
    {
        int gcd=1,lim,i;
        if(n2>n1)
        {
            lim=n2/2;
        }
        else
        {
            lim=n1/2;
        }
        for(i=lim;i>0;i--)
        {
            if(n1%i==0&&n2%i==0)
            {
                gcd=i;
                break;
            }
        }
        return gcd;
    }

    static int findLcm (int n1, int n2)
    {
        int lcm=1,i;
        if(n2>n1)
        {
            lcm=n2;
        }
        else
        {
            lcm=n1;
        }
        for(i=lcm;;i++)
        {
            if(i%n1==0&&i%n2==0)
            {
                lcm=i;
                break;
            }
        }
        return lcm;
    }
}





#im shubhay
