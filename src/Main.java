import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<String> aList = new ArrayList<String>();
        Scanner keyboard  = new Scanner(System.in);
        boolean isTrue = false;
        while (!isTrue)
        {
            System.out.println("Enter you demand");
            String demand = keyboard.nextLine();
            aList.add(demand);
            System.out.println("Again");
            String again = keyboard.nextLine();
            if(!again.equalsIgnoreCase("Yes"))
                isTrue = true;
        }
        System.out.println("List contains");
        for(String element : aList)
        {
            System.out.println(element);
        }
    }
}
