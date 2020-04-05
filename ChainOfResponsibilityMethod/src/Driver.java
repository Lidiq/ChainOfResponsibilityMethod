
public class Driver {

	public static void main(String[] args) {
		LoggingManager.setup(LoggingManager.DEBUG);
		//LoggingManager.setup(LoggingManager.WARNING);
		//LoggingManager.setup(LoggingManager.ERROR);
		LoggingManager.logError("...Loging an Error...");
		LoggingManager.logWarning("...Loging a Warning...");
		LoggingManager.logDebug("...Loging a Debug statement...");

	}

}
