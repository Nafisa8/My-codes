package Challenge;

import java.util.Scanner;
import java.util.Arrays;


public class Singledimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* I created an array called -times- with a size of 5. This array will be used to store
        the input times of taking pictures for each day (5days).
        By setting times as an array, this will enable me to store and access multiple values in organized way
        */
        String[] times = new String[5];

        /*
         now i add the for loop to repeat over each entry of the times arrays In this particular piece of code,
          this loop is used to prompt the user for the daily photo-taking time.
          By repeating from i = 0 to < times.length, the loop should exactly run five times. 
         */
        for (int i = 0; i < times.length; i++) {
        	
          /* Prompt the user to input times for each day  
           and the (i+1) is there to number the each day
           */
        	System.out.print("Enter the time without colon of taking pictures for day " + (i + 1) + ": ");
        	// to read users input
            times[i] = scanner.nextLine();
        }
        scanner.close();
        /* this is added to invoke the findcommontime method and be able to store 
         * its return value in variable called commontime
        */
        String commonTime = findCommonTime(times);

        /* once the common time is printed, the code checks if it is null using if 
         * else condition. so if the common time is not null that means a common time was included 
         * in the given inputs
        */
        if (commonTime != null) {
        	
        	// then this prints 
            System.out.println("The common time of taking pictures is: " + commonTime);
            
            //and if the common time is null then there is no commontimes in given inputs 
        } else {
        	//then this print 
            System.out.println("There is no common time among the given inputs.");
        }
    }

    /* this is a method to find the common time among the given inputs
     * this takes array of times as a parameter and returns the common times in 
     * the given input
     * below the method, each line has its own function
     */
    public static String findCommonTime(String[] times) {
        /*
         * i wanted it sorted ascending to read it easily
         */
        Arrays.sort(times);

        // the outer loop repeats times array
        for (int i = 0; i < times.length; i++) {
//the inner loops compares it and starts from next with (i+1)
            for (int j = i+1; j < times.length; j++) {
            	// if common time is found the method immediatly returns the commontime
                if (times[i].equals(times[j])) {
                   return times[i];
                }
            }
        }

//otherwise the method returns null to indicate that there is no common time among the given inputs.
        return null;
    }
}