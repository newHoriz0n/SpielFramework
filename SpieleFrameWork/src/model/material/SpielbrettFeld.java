package model.material;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class SpielbrettFeld {

	protected int [] position;
	protected int durchmesser;
	private int maxSpielerZahl;
	private List<SpielbrettFeld> nachfolger;
	
	public SpielbrettFeld(int [] position, int durchmesser, int maxSpielerZahl) {
		this.position = position.clone();
		this.durchmesser = durchmesser;
		this.maxSpielerZahl = maxSpielerZahl;
		this.nachfolger = new ArrayList<SpielbrettFeld>();
	}
	
	/**
	 * Löscht alle bekannten Nachbarschaften und fügt übergebene Nachbarschaften hinzu.
	 * @param nachfolger
	 */
	public void setNachfolger(List<SpielbrettFeld> nachfolger) {
		this.nachfolger.clear();
		this.nachfolger.addAll(nachfolger);
	}
	
	public int getMaxSpielerZahl() {
		return maxSpielerZahl;
	}

	public int[] getPosition() {
		return position;
	}
	
	public List<SpielbrettFeld> getNachfolger() {
		return nachfolger;
	}
	
	public void drawSpielbrettFeld(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(2));
		g.drawOval(position[0] - durchmesser/2, position[1] - durchmesser/2, durchmesser, durchmesser);
	}
	
}
