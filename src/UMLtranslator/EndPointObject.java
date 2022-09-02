package UMLtranslator;

import java.util.ArrayList;

public class EndPointObject {
	private String MicroName;
	ArrayList<String> endPoints = new ArrayList<String>();
	public ArrayList<String> getEndPoints() {
		return endPoints;
	}

	public void setEndPoints(String endPointToBedded) {
		endPoints.add(endPointToBedded);
	}

	
	
	  public String getMicroName() {
		return MicroName;
	}

	public void setMicroName(String microName) {
		MicroName = microName;
	}

}
