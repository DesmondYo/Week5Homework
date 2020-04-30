//3A.
public class AsteriskLogger implements Logger {

	public static void main(String[] args) {
		

	}
	
	//4.
	@Override
	public void log(String Hello) {
		System.out.println("***" + Hello + "***");
		
	}
	
	//5.
	@Override
	public void Error(String Error) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 13 + Error.length(); i++) {
			sb.append("*");
		}
		
		System.out.println(sb.toString() + "\n" + "***Error: "+ Error.toString() + "***" + "\n" + sb.toString());
		
	}
}


