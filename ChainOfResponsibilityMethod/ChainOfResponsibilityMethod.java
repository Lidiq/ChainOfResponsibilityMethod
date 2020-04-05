
public class DebugLogger2 extends AbstractLogger {

	protected boolean handleLogRequest(String message) {
		boolean flag=false;
		if(LoggingManager.logLevel==LoggingManager.DEBUG) {
			System.out.println("[Log level is DEBUG, using DebugLogger]:"+message);
			flag=true;
		}
		
		return flag;
	}

}
