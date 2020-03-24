import java.util.*;
public class q1
{
    public static String getDiv(int n, int k)
    {

        if(k > Math.sqrt(n))
        return "NO";

        if(n == 1)
        {
            if(k == 1)
            return "YES";
            else
            return "NO";
        }

        if( k == 1)
        {
            if(n % 2 == 0)
            return "NO";
            else
            return "YES";
        }

        if(k % 2 == 1)
        {
            if(n % 2 == 0)
            return "NO";
        }

        if(k % 2 == 0)
        {
            if(n % 2 == 1)
            return "NO";
        }
        
        int count = 1, total = 0, i = 1;
        while(count <= k)
        {
            total += i;
            i += 2;

            if(count == k-1)
            {
                if((n-total) % 2 == 1)
                return "YES";
            }
            count++;

        }
        return "NO";
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-->0)
        {
            int n = ob.nextInt();
            int k = ob.nextInt();

            System.out.println(getDiv(n, k));
        }
    }
}