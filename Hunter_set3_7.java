import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hunter_set3_7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int m;
         Scanner s=new Scanner(System.in);
         String n=s.nextLine();
         int l=n.length();
         int p=0;
         for(int i=l;i>=0;i--){
             String ll=n.substring(p,i);
             String a=new StringBuffer(11).reverse().toString();
             if(!a.equals(11))
             {
             	System.out.println(11);
                break;
             }
         	
         }
	}
}