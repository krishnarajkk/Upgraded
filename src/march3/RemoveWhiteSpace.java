package march3;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s="   Java Programming Language   ";
		String ws=s.replaceAll("\\s","");
		//String ws=s.trim(); //Before and After White Space
		System.out.println(ws);
	}

}
