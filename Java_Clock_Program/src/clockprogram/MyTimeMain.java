package clockprogram;

import java.util.Scanner;

/**
 * MyTimeMain is a program that demonstrates the usage of the MyTime class.
 * It allows the user to input time values and compare them with predefined times.
 */

public class MyTimeMain
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create a new instance of a MyTime object and set to noon (12 PM).
    MyTime noon = new MyTime(); 
    noon.setTime(12, 0, 0);

    MyTime wakeup = new MyTime();
    wakeup.setTime(6, 30, 0);

    //let's declare some integer variables here.
    int inHour, inMinute, inSecond; 
    do {
    	// Ask for time to be input, then create a new MyTime and set the time
        System.out.println();
        System.out.println("Enter hour minute and second (-1 to exit)"); 
        inHour = sc.nextInt();
        if (-1 == inHour)
            break;
        inMinute = sc.nextInt();
        inSecond = sc.nextInt();
        System.out.println();
        System.out.println("Values read were: " + inHour + " " +
                           inMinute + " " + inSecond);         
        

        // Create a new MyTime object t
        MyTime t = new MyTime();

        // Set the time to the time read from the user input.
        t.setTime(inHour,inMinute,inSecond);

        System.out.println(t.toString());
        System.out.println(t.toUniversalString());
        System.out.println("hour is " + t.getHour() + "  minute is " +
                            t.getMinute() + "  second is " + t.getSecond());

        // The user's input will go into t. Let's test if user's input matches the 'noon' MyTime object's value.
        if (t.equals(noon))
            System.out.println("Matches noon time");
        // Test if the time read matches the 'wakeup' MyTime object's value
        if (t.equals(wakeup))
            System.out.println("It's time to wakeup!");        
        
    } while (inHour != -1);
 // Keep console window alive until 'enter' pressed (if needed).
    System.out.println();
    System.out.println("Done - press enter key to end program");
        String junk = sc.nextLine();
    }
}