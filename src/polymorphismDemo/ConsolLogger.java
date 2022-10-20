package polymorphismDemo;

public class ConsolLogger extends BaseLogger {

	public void log(String message) {
		System.out.println("Logged to console" + message);
	}

}
