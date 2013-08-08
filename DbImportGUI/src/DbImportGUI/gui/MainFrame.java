package DbImportGUI.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3625993821001833103L;

	private JLabel _inputLabel;
	private JTextField _inputFileField;
	private JButton _browseInputButton;
	
	private JLabel _outputLabel;
	private JList _outputDbList;
	private JButton _outputDbNewButton;
	
	private JLabel _processLabel;
	private JList _processClassList;
	private JButton _processClassNewButton;
	
	private JButton _startButton;
	private JButton _stopButton;
	private JButton _testDbButton;
	
	private JTextArea _statusDisplay;
	
	private Container _pane;
	
	public void init(){
		this._pane = this.getContentPane();
		this._pane.setLayout(new GridBagLayout());
		this.addComponents();
	}
	
	private void addComponents(){
		addInputLine(0);
		this.addOutputLine(1);
	}
	
	private void addInputLine(int lineIndex){
		GridBagConstraints c = new GridBagConstraints();
		// add input label
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
		c.gridy = lineIndex;
		_inputLabel = new JLabel("Input:");		
		_pane.add(_inputLabel, c);
		
		// add input file field
		c.gridx = 1;
		_inputFileField = new JTextField(50);
		_pane.add(_inputFileField, c);
		
		// add browse input button
		c.gridx = 2;
		this._browseInputButton = new JButton("Browse");
		_pane.add(this._browseInputButton, c);
	}
	
	private void addOutputLine(int lineIndex){
		GridBagConstraints c = new GridBagConstraints();
		// add output label
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
		c.gridy = lineIndex;
		this._outputLabel = new JLabel("Output:");
		this._pane.add(this._outputLabel, c);
		
		// add output db list
		c.gridx = 1;
		
	}
	
	public void printStatus(String line){
		_statusDisplay.append(line+Main.newLine);
		_statusDisplay.setCaretPosition(_statusDisplay.getDocument().getLength());
	}
	
}
