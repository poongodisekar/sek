import java.io.*;
import java.util.*;
public class nloop{
 public static void main(String Key[])
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 whileloop
{
   
        
            int no=Integer.parseInt(Key[0]);
            int i=0;
            int sum=0;
            while(i<=no)
                {
                    sum+=i;
                    System.out.print(" "+i);
                    i++;
                }
            System.out.println("Sum Of Number Is:-"+sum);
        }
}
