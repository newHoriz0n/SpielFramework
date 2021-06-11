package view;

import javax.swing.JFrame;

import model.Model;

public class SpielFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Model m;
	
	public SpielFrame(Model m) {
		
		this.m = m;
		
		SpielView sv = new SpielView(m);
		add(sv);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		
	}
	

	
}
