package DbImportGUI.gui;

public class Main {
	public static GUIConfig config;
	public static MainFrame mf;
	public static void main(String[] args) {
		// read configuration file
		readConfig(args);
		mf = new MainFrame();
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
