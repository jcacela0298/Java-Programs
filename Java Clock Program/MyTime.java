package testPackage;

/**
 * MyTime is a class that represents time in both 24-hour (military) and 12-hour time formats.
 * It provides methods to set and retrieve time values, format time, and compare times.
 */

public class MyTime {
	
    // These are instance variables holding the time (in 24 hour universal form).
    private int mHour;      // 0 - 23
    private int mMinute;    // 0 - 59
    private int mSecond;    // 0 - 59
     
    public void setTime(int hour, int minute, int second){

        // If any of the parameters are out of range, set all the instance variables to zero.
    	if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
    	    // Here, this means input is valid, so set the time received from the user to our instance variables that we made above.
    	    mHour = hour;
    	    mMinute = minute;
    	    mSecond = second;
    	} else {
    	    // Invalid input, set to default values (0)
    	    mHour = 0;
    	    mMinute = 0;
    	    mSecond = 0;
    	    System.out.println("Error: Invalid Input");
    	}

} 
     
    public int getHour(){

        // When this method is called, it returns the hour value represented by this MyTime object as an integer.
        return mHour;
    }

    public int getMinute(){
     
        return mMinute;
    }

    public int getSecond(){
       
        return mSecond;
    }

    
    public boolean equals(MyTime other) {
        // Compare the hour, minute, and second of 'this' MyTime object with 'other'
        if (this.mHour == other.mHour && this.mMinute == other.mMinute && this.mSecond == other.mSecond) {
            return true; // This would mean that all three values match, the two represent the same time.
        } else {
            return false;
        }
    }

    
    public String toString(){

        // This method converts the instance variables into HH:MM:SS AM/PM time (hour ranges from 1 to 12, AM or PM) 
    	// It also uses the method TwoDigits to convert each int value to a string and returns it. 
    	// This method is not to be confused with the Java built in Integer.toString() method that we will see below.
        // Now let's determine whether it's AM or PM:
        String amPm = (mHour < 12) ? "AM" : "PM";
        
        // Calculate the formatted hour (ranges from 1 to 12)
        int formattedHour = (mHour % 12 == 0) ? 12 : mHour % 12;

        // Use the twoDigits method to format the minute and second
        String formattedMinute = twoDigits(mMinute);
        String formattedSecond = twoDigits(mSecond);

        // Construct the formatted time string
        String formattedTime = formattedHour + ":" + formattedMinute + ":" + formattedSecond + " " + amPm;

        return formattedTime;
    }
    
    public String toUniversalString() {
    	
    	//This method converts the instance values into military time (hour ranges from 0 to 23)
    	 String formattedHour1 = twoDigits(mHour);

         // Use the twoDigits method to format the minute and second
         String formattedMinute = twoDigits(mMinute);
         String formattedSecond = twoDigits(mSecond);

         // Construct the formatted time string
         String formattedTime = formattedHour1 + ":" + formattedMinute + ":" + formattedSecond;

         return formattedTime;
    }
    
    private String twoDigits(int value){
    	
    	// The Integer.toString(int) method to converts 'value' to String format, adding a leading "0" if the value is less than 10
        //This way a string is returned with two digits.
        if (value < 10) {
        return "0" + Integer.toString(value);
    } else {
        return Integer.toString(value);
      
    }

    }
}