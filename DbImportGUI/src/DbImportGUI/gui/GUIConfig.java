package DbImportGUI.gui;

import java.util.*;
public class GUIConfig {

	public String title;
	public ArrayList<DbInfo> dbArray;
	
	public void defaultInit(){
		this.title = "Import Data File to Database";
		this.dbArray = new ArrayList<DbInfo>();
	}
	public void initFromFile(){
		
	}
	
}
