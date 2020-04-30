//3B.
public class SpacedLogger implements Logger {

	public static void main(String[] args) {
		

	}
	
	//6 & 7.
	@Override
	public void log(String log) {
		String input = log.toString();
		StringBuilder sb = new StringBuilder();
		for (char letter : input.toCharArray()) {
			sb.append(letter).append(" ");
		}
		System.out.println(sb.toString());
	}
	
	//8.
	@Override
	public void Error(String Error) {
			String input = Error.toString();
			StringBuilder sb = new StringBuilder();
			for (char letter : input.toCharArray()) {
				sb.append(letter).append(" ");
			}
			System.out.println("Error: "+ sb.toString() );
		}
	}