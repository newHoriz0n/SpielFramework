package test.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.material.SpielbrettFeld;
import model.material.Spielfigur;

public class MADNSpielfigur extends Spielfigur {

	private Color[] colors = new Color[] { Color.ORANGE, Color.RED, Color.BLACK, Color.GREEN };

	public MADNSpielfigur(int besitzer, SpielbrettFeld position) {
		super(besitzer, 12, position);
	}

	@Override
	public void drawSpielfigur(Graphics2D g) {
		g.setColor(colors[besitzer - 1].brighter());
		g.fillOval(aktFeld.getPosition()[0] - durchmesser / 2, aktFeld.getPosition()[1] - durchmesser / 2, durchmesser,
				durchmesser);
		g.setStroke(new BasicStroke());
		g.setColor(Color.WHITE);
		g.drawOval(aktFeld.getPosition()[0] - durchmesser / 2, aktFeld.getPosition()[1] - durchmesser / 2, durchmesser,
				durchmesser);
		g.setColor(Color.BLACK);
		g.drawOval(aktFeld.getPosition()[0] - durchmesser / 2 + 1, aktFeld.getPosition()[1] - durchmesser / 2 + 1,
				durchmesser - 2, durchmesser - 2);
	}

}
