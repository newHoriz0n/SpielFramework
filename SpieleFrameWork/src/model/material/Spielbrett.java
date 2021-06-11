package model.material;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Spielbrett {

	protected List<SpielbrettFeld> felder;
	
	public Spielbrett() {
		this.felder = new ArrayList<SpielbrettFeld>();
	}
	
	public void addSpielbrettFeld(SpielbrettFeld sbf) {
		this.felder.add(sbf);
	}
	
	public void drawSpielbrett(Graphics2D g) {
		for (SpielbrettFeld s : felder) {
			s.drawSpielbrettFeld(g);
		}
	}
}

