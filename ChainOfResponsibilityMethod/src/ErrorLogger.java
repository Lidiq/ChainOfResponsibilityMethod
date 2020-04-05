
public class ErrorLogger extends AbstractLogger {

	protected boolean handleLogRequest(String message) {
		boolean flag=false;
		if(LoggingManager.logLevel==LoggingManager.ERROR) {
			System.out.println("[Log level is ERROR, using ErrorLogger]:"+message);
			flag=true;
		}
		
		return flag;
	}

}

