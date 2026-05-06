package MicroserviceObject;

import PIM.InfrastructurePatternCategory;

public class PatternComponentstObject {
	private InfrastructurePatternCategory catagory;

	public PatternComponentstObject(InfrastructurePatternCategory infrastructurePatternCategory) {
		this.catagory = infrastructurePatternCategory;
	}

	public InfrastructurePatternCategory getCategory() {
		return catagory;
	}

	public String getCategoryLabel() {
		if (catagory == null) {
			return "Unknown";
		}

		String value = catagory.getLiteral();

		if (value.contains("_Pattern_")) {
			value = value.substring(value.indexOf("_Pattern_") + "_Pattern_".length());
		}

		return toTitleCase(value.replace("_", " "));
	}

	public String getType() {
		return "InfrastructurePatternComponent";
	}

	public String toString() {
		return getCategoryLabel();
	}

	private String toTitleCase(String value) {
		String[] words = value.toLowerCase().split("\\s+");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (word.isEmpty()) {
				continue;
			}

			if (word.equals("api")) {
				result.append("API");
			} else {
				result.append(Character.toUpperCase(word.charAt(0)));
				result.append(word.substring(1));
			}

			result.append(" ");
		}

		return result.toString().trim();
	}
}