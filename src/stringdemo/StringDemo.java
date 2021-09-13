package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fname="Aman Kumar Sharma";
		String namedemo ="Abhinav Sharma";
				System.out.println("Length of Name = "+namedemo.length());
				
				String ConvertUppercaseDemo="abhinav sharma";
				System.out.println("ConvertUppercase = "+ConvertUppercaseDemo.toUpperCase());
				
				String ConvertLowercaseDemo = "ABHINAV SHARMA";
				System.out.println("ConvertLowercaseDemo = "+ConvertLowercaseDemo.toLowerCase());
				
				char ast = namedemo.charAt(9);
				System.out.println("Index Range = "+ast);
				
				// compare to method
				System.out.println(fname.length());
				System.out.println("CompareTo() = "+fname.compareTo(namedemo));
				
				// concat string
				System.out.println("ConcatTo() = "+fname.concat(" "+namedemo));
				
				// CONTAINS Return Boolean Value
				System.out.println("Contains To = "+fname.contains(fname));//true string contains
				System.out.println("Contains To = "+fname.contains(namedemo));//false string not contains
				
				//ENDS WITH return Boolean Value
				System.out.println(fname.endsWith("a"));//returns True
				System.out.println(fname.endsWith(ConvertLowercaseDemo));//returns false
				
				//EQUALS TO RETURN BOOLEAN VALUE
				System.out.println(fname.equals(fname));//return True
				System.out.println(fname.equals(namedemo));//return True
	}

}
