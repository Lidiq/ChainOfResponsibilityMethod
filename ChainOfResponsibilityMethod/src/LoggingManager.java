
public class LoggingManager {
	public static int DEBUG = 0;
	public static int WARNING = 1;
	public static int ERROR = 2;
	protected static int logLevel = DEBUG;
	public static AbstractLogger errorLogger;
	public static AbstractLogger warningLogger;
	public static AbstractLogger debugLogger;
	public static void setup(int logLevel) {
		LoggingManager.logLevel = logLevel;
		errorLogger = new ErrorLogger();
		warningLogger = new WarningLogger();
		debugLogger = new DebugLogger2();
		errorLogger.setNextLogger(warningLogger);
		warningLogger.setNextLogger(debugLogger);
		
	}

	public static void logError(String logMessage) {
		errorLogger.postLogRequest(logMessage);
	}
	public static void logWarning(String logMessage) {
		warningLogger.postLogRequest(logMessage);
	}
	public static void logDebug(String logMessage) {
		debugLogger.postLogRequest(logMessage);
	}

}
