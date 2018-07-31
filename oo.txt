import java.util.Scanner.*;
public Leap{

public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
               
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}