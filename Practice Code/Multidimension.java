package Challenge;

public class Multidimension {

	    public static void main(String[] args) {
/*
 *	     the camera settings variable is declared as a 2D array which is a an array where the
 *data element is referred to. by rows and columns.
 *the two sets of brackets means 2D
 *in this array i stored diff camera settings such as photo type, mode,iso,shutter speed.
 *and i have to follow same structure or else it will be printed as "mode : portrait"   
 */
	    	String[][] cameraSettings = {
	                {"Portrait", "Aperture priority", "ISO 300", "Shutter speed 1/200s"},
	                {"Landscape", "Manual mode", "ISO 200", "Shutter speed 1/1000s"},
	                {"Macro", "Aperture priority", "ISO 400", "Shutter speed 1/60s"},
	                {"Night", "Manual mode", "ISO 800", "Shutter speed 10s"},
	                {"Sports", "Shutter priority", "ISO 1600", "Shutter speed 1/1000s"}
	        };

	        /*
	         * the loop starts with i with value of 0, and it repeats as long as 
	         * i is less than the length of the camera setting array
	         * in each line that repeats the code retrives the inner array using 
	         * camerasetting[i] and assigns it to the setting variable
	        */
	        for (int i = 0; i < cameraSettings.length; i++) {
	            String[] settings = cameraSettings[i];
	            
	            /*
	             * then it prints out the specific element of the settings array which
	             * represents the mode,photo type, mode and ISO value and shutter speed for the photo
	          it starts with 0 bc i=0
	             */
	            System.out.println("Photo Type: " + settings[0]);
	            System.out.println("Mode: " + settings[1]);
	            System.out.println("ISO: " + settings[2]);
	            System.out.println("Shutter Speed: " + settings[3]);
	            // this is added to print blank line for sepration of each photo thats printed 
	            System.out.println();
	        }
	    }}