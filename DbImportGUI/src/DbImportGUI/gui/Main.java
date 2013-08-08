package DbImportGUI.gui;

import javax.swing.JFrame;

public class Main {
	public static GUIConfig config = new GUIConfig();
	public static MainFrame mf;
	public static final String newLine = "\n";
	
	public static void main(String[] args) {
		// read configuration file
		readConfig(args);
		mf = new MainFrame();
		mf.setTitle(config.title);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.init();
		mf.pack();
		mf.setVisible(true);
	}
	
	private static void readConfig(String[] args){
		String configFile = "";
		if (args.length == 0){
			// default to "config.csv"
			configFile = "config.csv";
		}else{
			configFile = args[0];
		}
		if (configFile.trim().equals("")){
			configFile = "config.csv";
		}
		
	}
	
	public static void saveConfig(){
		
	}

}
