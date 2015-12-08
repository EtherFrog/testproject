package edu.iut.app;

/**les logs d'info
 * 
 * @author Joe&Jonhatan
 *
 */
public class ApplicationInfoLog extends AbstractApplicationLog {

	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(message);
        super.fireMessage("[INFO]", this.message);
	}

}
