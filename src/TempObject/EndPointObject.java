package TempObject;

import java.util.ArrayList;
import java.util.Arrays;

public class EndPointObject {
	private String MicroName;
	ArrayList<String> endPoints = new ArrayList<String>();
	public ArrayList<String> getEndPoints() {
		return endPoints;
	}

	public void setEndPoints(String endPointToBedded) {
		endPoints.add(endPointToBedded);
		//System.out.println("Micro name and end point : " + MicroName + " " + endPoints);
	}

	
	
	  public String getMicroName() {
		return MicroName;
	}

	public void setMicroName(String microName) {
		MicroName = microName;
	}
	
	

}
