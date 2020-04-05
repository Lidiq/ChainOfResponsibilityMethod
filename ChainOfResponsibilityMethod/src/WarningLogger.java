
public class WarningLogger extends AbstractLogger {

	protected boolean handleLogRequest(String message) {
		boolean flag=false;
		if(LoggingManager.logLevel==LoggingManager.WARNING) {
			System.out.println("[Log level is WARNING, using WarningLogger]:"+message);
			flag=true;
		}
		
		return flag;
	}

}
