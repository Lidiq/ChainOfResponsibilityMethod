
public abstract class AbstractLogger 
{
	protected AbstractLogger nextLogger;
	public AbstractLogger setNextLogger(AbstractLogger logger) {
		nextLogger = logger;
		return nextLogger;
	}
	protected abstract boolean handleLogRequest(String message);
	public void postLogRequest(String message) {
		boolean flag = handleLogRequest(message);
		if (!flag && (nextLogger!= null)) {
			nextLogger.postLogRequest(message);
		}
	}

}
