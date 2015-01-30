//Michaela Martines
//1-30-15
//CSE002, Section 112
//Cyclometer Java Program
//  will perform the following:
//      print the number of minutes for each trip
//      print the number of counts for each tirp
//      print the distance of each trip in miles
//      print the distance for the two trips combined

//  define a class
    public class Cyclometer {
    
//  add main method
    public static void main(String[] args) {
        
        
        //create variables that will store the number of seconds for each 
        //trip and the number of counts (rotations) for each trip

	   	int secsTrip1=480;  //seconds in Trip 1
       	int secsTrip2=3220;  //seconds in Trip 2
		int countsTrip1=1561;  //rotations in Trip 1
		int countsTrip2=9037; //rotations in Trip 2
		
		
		// create variables for useful constants and for storing the various distances

		double wheelDiameter=27.0,  //the wheels' diameters; they are the same
  	    PI=3.14159, //the constant pi
  	    feetPerMile=5280,  //conversion between feet and miles
    	inchesPerFoot=12,   //conversion between inches and feet
    	secondsPerMinute=60;  //conversion between seconds and minutes
	    double distanceTrip1, distanceTrip2,totalDistance;  //how far the wheels have traveled
	    
	    
	    //print out the numbers that you have stored in the variables 
	    //store number of seconds and the counts
	    
	       System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
       	      
        //compute the values for the distances
        
            //distance in inches
            distanceTrip1=countsTrip1*wheelDiameter*PI;

    	    //(for each count, a rotation of the wheel travels
    	    //the diameter in inches times PI)
    	    distanceTrip1/=inchesPerFoot*feetPerMile; 
	
	        // Gives distance in miles
    	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	        totalDistance=distanceTrip1+distanceTrip2;
	    
	    
	    //Print out the distances
	    
	     System.out.println("Trip 1 was "+distanceTrip1+" miles");
	     System.out.println("Trip 2 was "+distanceTrip2+" miles");
	     System.out.println("The total distance was "+totalDistance+" miles");


		
    }   //end of main method
    
}   //end of class
