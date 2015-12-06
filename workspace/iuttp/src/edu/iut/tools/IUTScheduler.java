package edu.iut.tools;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import edu.iut.app.CommandLineOption;
import edu.iut.app.CommandLineParser;


public class IUTScheduler {
	public static void main(String[] args) {

		CommandLineParser commandLineParser = new CommandLineParser();

		CommandLineOption<java.io.File> configOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE, "config","configuration file",new java.io.File("/tmp"));
		
		CommandLineOption<String> localeOption = new CommandLineOption<String>(CommandLineOption.OptionType.STRING,"locale","en|fr",new String("fr"));
		
		CommandLineOption<java.io.File> projectOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE,"project file","xml project file",new java.io.File("/tmp"));

		commandLineParser.addOption(configOption);
		commandLineParser.addOption(localeOption);
		commandLineParser.addOption(projectOption);

		commandLineParser.parse(args);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
				mainFrame.setVisible(true);		        
			}
		});
	}

}
