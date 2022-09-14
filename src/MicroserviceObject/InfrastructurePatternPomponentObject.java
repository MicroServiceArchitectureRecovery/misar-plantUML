package MicroserviceObject;

import PIM.InfrastructurePatternCategory;

public class InfrastructurePatternPomponentObject {
	
	private static int instanceCounter = 0;
	int counter = 0;

	public static int getCount() {
		return instanceCounter;
	}

	public void setCount() {
		instanceCounter++;
		counter = instanceCounter;
	}

	InfrastructurePatternCategory catagory;

	public InfrastructurePatternPomponentObject(InfrastructurePatternCategory infrastructurePatternCategory) {
		this.catagory = infrastructurePatternCategory;
	}

	public InfrastructurePatternCategory getCategory() {
		// TODO Auto-generated method stub
		return catagory;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return "InfustructurePatternComponent";
	};

	public String toString() {// overriding the toString() method
		return catagory.toString();
	}
	
	

}

