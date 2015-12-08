package edu.iut.app;

/**les logs d'erreur
 * 
 * @author Joe&Jonhatan
 *
 */
public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(message);
		super.fireMessage("[ERROR]", this.message);
	}


}
