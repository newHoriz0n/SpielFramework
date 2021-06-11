package model.material;

import java.awt.Graphics2D;

public abstract class Spielfigur {

	protected int besitzer;
	protected SpielbrettFeld aktFeld;
	protected int durchmesser;
	
	
	public Spielfigur(int besitzer, int durchmesser, SpielbrettFeld position) {
		this.besitzer = besitzer;
		this.aktFeld = position;
		this.durchmesser = durchmesser;
	}
	
	public abstract void drawSpielfigur(Graphics2D g);
	
	public SpielbrettFeld getAktFeld() {
		return aktFeld;
	}
	
	public int getBesitzer() {
		return besitzer;
	}
	
	public int getDurchmesser() {
		return durchmesser;
	}

	public void zieheNach(SpielbrettFeld zielFeld) {
		this.aktFeld = zielFeld;
	}
	
}
