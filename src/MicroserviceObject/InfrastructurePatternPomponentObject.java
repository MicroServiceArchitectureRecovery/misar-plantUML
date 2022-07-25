package MicroserviceObject;

import PIM.InfrastructurePatternCategory;

public class InfrastructurePatternPomponentObject {

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

