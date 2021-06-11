package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import model.Model;

public class SpielView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Model m;
	
	public SpielView(Model m) {
		
		this.m = m;
		
		setDoubleBuffered(true);
		
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				updateUI();
			}
		}, 0, 100);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
	
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		m.drawModel(g2d);
		
	}

}
