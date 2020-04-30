//9.
public class App {

	public static void main(String[] args) {
		
		//10 & 11.
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello, welcome");
		
		logger.Error("This will be resolved soon");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Welcome to the Jungle ");
		
		logger2.Error("You lose");

	}
}