package MicroserviceObject;

import PIM.InfrastructurePatternCategory;

public class PatternComponentstObject {
	

	InfrastructurePatternCategory catagory;
	

	public PatternComponentstObject(InfrastructurePatternCategory infrastructurePatternCategory) {
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

