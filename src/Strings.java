import java.time.Duration;
import java.time.Instant;

public class Strings {
  public static void main(String[] args) {
    Instant start = Instant.now();
    System.out.println("Start");
    // -----------------[ IGNORE ABOVE ]----------------------    


	// Create an empty string. 
	
    String loop = "";
    
	// Write a loop that will run 10000 times.
	    
	    for  (int i = 0; i < 100000; i ++) {
	      
	      //loop = loop + ".";
	      loop += "."; 
	        if ( i % 100 == 0) {
	          loop += "\r\n";
	       
	        }
	      
	    }
	// Each time through, append a "." to the end of the string.
	// Every 100 times, append a line feed (\r\n) to the string
	// so that our display scrolls down when we output it.
		
	// After creating your string, output the value to the screen.
	    System.out.println( loop );
    // Make note of how long it takes to run.
    // Modify the loop so that it will run 100000 times.
    // How long did it take to run this time? Why?
	
	    // The first loop took 0.064 seconds and the second loop took 1.348 seconds.

    // -----------------[ IGNORE BELOW ]----------------------    
    Instant finish = Instant.now();
    System.out.printf("Elapsed: %1.3f seconds\r\n", 
                      Duration.between(start, finish).toMillis() / 1000f);
    System.out.println("Complete");
  }
}
