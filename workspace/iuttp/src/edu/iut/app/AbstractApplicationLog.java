package edu.iut.app;

import java.util.ArrayList;


/**
 *  Classe mere des ApplicationLog
 * 
 * @author Joe&Jonhatan
 *
 */
public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;

	protected ArrayList<IApplicationLogListener> listeners;
	
	/**
	 * 
	 */
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
	/**
	 * 
	 * @param message le messsage du log
	 * @param listener le listener du log
	 */
	public AbstractApplicationLog(String message,IApplicationLogListener listener) {
		this.message = message;
		listeners = new ArrayList<IApplicationLogListener>();
		listeners.add(listener); 
	}
	
    /* Fonction de l'interface */
	
	/**
	 * defini le message
	 */
	@Override
	public abstract void setMessage(String message);
	
	/**
	 * retourne le message
	 */
	@Override
	public String getMessage()
	{
		return message;
	}
	
	/**
	 * ajoute un listener
	 */
	@Override
	public void addListener(IApplicationLogListener listener)
	{
		listeners.add(listener);
	}
	
	/**
	 * retourne les listeners
	 */
	@Override
	public ArrayList<IApplicationLogListener> getApplicationLogListeners()
	{	
		return listeners;	
	}

	
	/* Listener action */
	/**envoie un message
	 * 
	 * @param level le niveau du message
	 * @param message le message
	 */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
