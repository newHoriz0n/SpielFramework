package test.model;

import java.awt.Color;
import java.awt.Graphics2D;

import model.material.SpielbrettFeld;

public class MADNSpielbrettFeldZiel extends SpielbrettFeld {

	private int spielerID;

	private Color[] colors = new Color[] {Color.ORANGE, Color.RED, Color.BLACK, Color.GREEN};
	
	public MADNSpielbrettFeldZiel(int posX, int posY, int spielerID) {
		super(new int [] {posX, posY}, 15, 1);
		this.spielerID = spielerID;
	}
	
	public void drawSpielbrettFeld(Graphics2D g) {
		g.setColor(colors[spielerID - 1]);
		g.fillOval(position[0] - durchmesser/2, position[1] - durchmesser/2, durchmesser, durchmesser);
	}
	

}
