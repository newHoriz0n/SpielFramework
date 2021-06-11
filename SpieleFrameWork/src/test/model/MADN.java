package test.model;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import model.Model;
import model.material.Spielfigur;

public class MADN extends Model {

	private MADNspielbrett spielbrett;
	private List<Spielfigur> spielfiguren;
	
	public MADN() {
		this.spielbrett = new MADNspielbrett();
		
		loadSpieler();
		
	}
	
	private void loadSpieler() {
		this.spielfiguren = new ArrayList<Spielfigur>();
		this.spielfiguren.add(new MADNSpielfigur(1, spielbrett.getHeimFelder(1).get(3)));
	}

	public void updateMADN() {

		spielfiguren.get(0).zieheNach(spielfiguren.get(0).getAktFeld().getNachfolger().get(0));
		
	}
	
	@Override
	public void drawModel(Graphics2D g) {
		
		spielbrett.drawSpielbrett(g);
		for (Spielfigur s : spielfiguren) {
			s.drawSpielfigur(g);
		}

		updateMADN();
	}

}
