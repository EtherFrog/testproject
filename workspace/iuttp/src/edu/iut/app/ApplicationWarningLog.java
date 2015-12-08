package edu.iut.app;

/**les logs de warning
 * 
 * @author Joe&Jonhatan
 *
 */
public class ApplicationWarningLog extends AbstractApplicationLog {

	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(message);
		super.fireMessage("[WARNING]", this.message);
	}
}
