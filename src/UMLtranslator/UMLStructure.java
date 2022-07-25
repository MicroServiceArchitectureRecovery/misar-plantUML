package UMLtranslator;



public class UMLStructure {

	public UMLStructure() {
		// TODO Auto-generated constructor stub
	}
	
	public static void structureMthod(StringBuilder sb) {

		sb.append("skinparam component ");
		sb.append(" {");	
		sb.append("\n");
		sb.append("backgroundColor<<InfrastructureMicroservice>> DarkKhaki");
		sb.append("\n");
		sb.append("backgroundColor<<FunctionalMicroservice>> Blue" );
		sb.append("\n");
		sb.append("backgroundColor<<Microservice>> Red");
		sb.append("\n");
		sb.append("}");

	

	}

	
}
