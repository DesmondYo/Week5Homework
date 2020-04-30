public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello, welcome");
		
		logger.Error("This will be resolved soon");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Welcome to the Jungle ");
		
		logger2.Error("You lose");

	}

}
