/*
   File: Main.java
   Description: Mountain class project.
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 6/4/2019, 1:01:48 AM
 */
import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args) throws FileNotFoundException
{
	File inputFile = new File("MountainData.CSV");
	Scanner in = new Scanner(inputFile);
	ArrayList<Mountain> MountainData = new ArrayList<Mountain>();

	while (in.hasNextLine()) {
		String line = in.nextLine();
		String[] mountainData = line.split(","); // Expected: 0 = Name, 1 = Country, 2 = Elevation.
		Double elevation = Double.parseDouble(mountainData[2]);
		MountainData.add(new Mountain(mountainData[0], mountainData[1], elevation));
	}
	in.close();
	Double lowest_elevation = minElevation(MountainData); // Min Elevation
	System.out.println("======================================================================================");
	System.out.printf("%-30s %-30s %10s %10s %n", "MOUNTAIN", "COUNTRY", "ELEVATION FT", "ELEVATION M");
	System.out.println("======================================================================================");
  for(Mountain mtn : MountainData){
    Double meter_elevation = mtn.toMeters();
    System.out.printf("%-30s %-30s %10.0f %10.2f %n", mtn.getName(), mtn.getCountry(), mtn.getElevation(), meter_elevation);
  }
	System.out.println("======================================================================================");
  for(Mountain mtn : MountainData){
    if (mtn.getElevation() == lowest_elevation){
      System.out.println("The Lowest mountain is: " + mtn.getName() + "at elevation: " + mtn.getElevation());
    }
  }


}
public static Double minElevation(ArrayList<Mountain> v){

  Double min_elevation = 50000.0;

	for (Mountain mtn : v) {
		if (mtn.getElevation() < min_elevation) {
			min_elevation = mtn.getElevation();
		}
	}
	return min_elevation;
}
}
