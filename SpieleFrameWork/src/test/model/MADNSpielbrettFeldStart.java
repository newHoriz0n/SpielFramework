package test.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.material.SpielbrettFeld;

public class MADNSpielbrettFeldStart extends SpielbrettFeld{

	private int spielerID;

	private Color[] colors = new Color[] {Color.ORANGE, Color.RED, Color.BLACK, Color.GREEN};  
	
	public MADNSpielbrettFeldStart(int posX, int posY, int spielerID) {
		super(new int [] {posX, posY}, 20, 1);
		this.spielerID = spielerID;
	}
	
	public void drawSpielbrettFeld(Graphics2D g) {
		g.setColor(colors[spielerID - 1]);
		g.setStroke(new BasicStroke(3));
		g.drawOval(position[0] - durchmesser/2, position[1] - durchmesser/2, durchmesser, durchmesser);
	}


	
}
