package edu.iut.app;

/**
 * 
 * @author Ether
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
