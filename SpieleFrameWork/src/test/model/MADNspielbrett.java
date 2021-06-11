package test.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.material.Spielbrett;
import model.material.SpielbrettFeld;

public class MADNspielbrett extends Spielbrett {
	
	private List<List<SpielbrettFeld>> heime;
	
	public MADNspielbrett() {

		super();
		this.heime = new ArrayList<>();
		List<SpielbrettFeld> heime1 = new ArrayList<>();
		List<SpielbrettFeld> heime2 = new ArrayList<>();
		List<SpielbrettFeld> heime3 = new ArrayList<>();
		List<SpielbrettFeld> heime4 = new ArrayList<>();
		heime.add(heime1);
		heime.add(heime2);
		heime.add(heime3);
		heime.add(heime4);
		
		loadSpielfelder();

	}

	private void loadSpielfelder() {
		
		// Hauptfelder
		SpielbrettFeld sbf01 = new MADNSpielbrettFeldStart(0, 120, 1);
		SpielbrettFeld sbf02 = new MADNSpielbrettFeldNormal(30, 120);
		SpielbrettFeld sbf03 = new MADNSpielbrettFeldNormal(60, 120);
		SpielbrettFeld sbf04 = new MADNSpielbrettFeldNormal(90, 120);
		SpielbrettFeld sbf05 = new MADNSpielbrettFeldNormal(120, 120);
		SpielbrettFeld sbf06 = new MADNSpielbrettFeldNormal(120, 90);
		SpielbrettFeld sbf07 = new MADNSpielbrettFeldNormal(120, 60);
		SpielbrettFeld sbf08 = new MADNSpielbrettFeldNormal(120, 30);
		SpielbrettFeld sbf09 = new MADNSpielbrettFeldNormal(120, 0);
		SpielbrettFeld sbf10 = new MADNSpielbrettFeldNormal(150, 0);
		SpielbrettFeld sbf11 = new MADNSpielbrettFeldStart(180, 0, 4);
		SpielbrettFeld sbf12 = new MADNSpielbrettFeldNormal(180, 30);
		SpielbrettFeld sbf13 = new MADNSpielbrettFeldNormal(180, 60);
		SpielbrettFeld sbf14 = new MADNSpielbrettFeldNormal(180, 90);
		SpielbrettFeld sbf15 = new MADNSpielbrettFeldNormal(180, 120);
		SpielbrettFeld sbf16 = new MADNSpielbrettFeldNormal(210, 120);
		SpielbrettFeld sbf17 = new MADNSpielbrettFeldNormal(240, 120);
		SpielbrettFeld sbf18 = new MADNSpielbrettFeldNormal(270, 120);
		SpielbrettFeld sbf19 = new MADNSpielbrettFeldNormal(300, 120);
		SpielbrettFeld sbf20 = new MADNSpielbrettFeldNormal(300, 150);
		SpielbrettFeld sbf21 = new MADNSpielbrettFeldStart(300, 180, 2);
		SpielbrettFeld sbf22 = new MADNSpielbrettFeldNormal(270, 180);
		SpielbrettFeld sbf23 = new MADNSpielbrettFeldNormal(240, 180);
		SpielbrettFeld sbf24 = new MADNSpielbrettFeldNormal(210, 180);
		SpielbrettFeld sbf25 = new MADNSpielbrettFeldNormal(180, 180);
		SpielbrettFeld sbf26 = new MADNSpielbrettFeldNormal(180, 210);
		SpielbrettFeld sbf27 = new MADNSpielbrettFeldNormal(180, 240);
		SpielbrettFeld sbf28 = new MADNSpielbrettFeldNormal(180, 270);
		SpielbrettFeld sbf29 = new MADNSpielbrettFeldNormal(180, 300);
		SpielbrettFeld sbf30 = new MADNSpielbrettFeldNormal(150, 300);
		SpielbrettFeld sbf31 = new MADNSpielbrettFeldStart(120, 300, 3);
		SpielbrettFeld sbf32 = new MADNSpielbrettFeldNormal(120, 270);
		SpielbrettFeld sbf33 = new MADNSpielbrettFeldNormal(120, 240);
		SpielbrettFeld sbf34 = new MADNSpielbrettFeldNormal(120, 210);
		SpielbrettFeld sbf35 = new MADNSpielbrettFeldNormal(120, 180);
		SpielbrettFeld sbf36 = new MADNSpielbrettFeldNormal(90, 180);
		SpielbrettFeld sbf37 = new MADNSpielbrettFeldNormal(60, 180);
		SpielbrettFeld sbf38 = new MADNSpielbrettFeldNormal(30, 180);
		SpielbrettFeld sbf39 = new MADNSpielbrettFeldNormal(0, 180);
		SpielbrettFeld sbf40 = new MADNSpielbrettFeldNormal(0, 150);

		//Heimfelder
		SpielbrettFeld hf11 = new MADNSpielbrettFeldHeim(0, 0, 1);
		SpielbrettFeld hf12 = new MADNSpielbrettFeldHeim(0, 30, 1);
		SpielbrettFeld hf13 = new MADNSpielbrettFeldHeim(30, 0, 1);
		SpielbrettFeld hf14 = new MADNSpielbrettFeldHeim(30, 30, 1);
		SpielbrettFeld hf21 = new MADNSpielbrettFeldHeim(300, 300, 2);
		SpielbrettFeld hf22 = new MADNSpielbrettFeldHeim(300, 270, 2);
		SpielbrettFeld hf23 = new MADNSpielbrettFeldHeim(270, 300, 2);
		SpielbrettFeld hf24 = new MADNSpielbrettFeldHeim(270, 270, 2);
		SpielbrettFeld hf31 = new MADNSpielbrettFeldHeim(0, 300, 3);
		SpielbrettFeld hf32 = new MADNSpielbrettFeldHeim(0, 270, 3);
		SpielbrettFeld hf33 = new MADNSpielbrettFeldHeim(30, 300, 3);
		SpielbrettFeld hf34 = new MADNSpielbrettFeldHeim(30, 270, 3);
		SpielbrettFeld hf41 = new MADNSpielbrettFeldHeim(300, 0, 4);
		SpielbrettFeld hf42 = new MADNSpielbrettFeldHeim(300, 30, 4);
		SpielbrettFeld hf43 = new MADNSpielbrettFeldHeim(270, 0, 4);
		SpielbrettFeld hf44 = new MADNSpielbrettFeldHeim(270, 30, 4);

		heime.get(0).add(hf11);
		heime.get(0).add(hf12);
		heime.get(0).add(hf13);
		heime.get(0).add(hf14);
		heime.get(1).add(hf21);
		heime.get(1).add(hf22);
		heime.get(1).add(hf23);
		heime.get(1).add(hf24);
		heime.get(2).add(hf31);
		heime.get(2).add(hf32);
		heime.get(2).add(hf33);
		heime.get(2).add(hf34);
		heime.get(3).add(hf41);
		heime.get(3).add(hf42);
		heime.get(3).add(hf43);
		heime.get(3).add(hf44);
		
		//Zielfelder
		SpielbrettFeld zf11 = new MADNSpielbrettFeldZiel(30, 150, 1);
		SpielbrettFeld zf12 = new MADNSpielbrettFeldZiel(60, 150, 1);
		SpielbrettFeld zf13 = new MADNSpielbrettFeldZiel(90, 150, 1);
		SpielbrettFeld zf14 = new MADNSpielbrettFeldZiel(120, 150, 1);
		SpielbrettFeld zf21 = new MADNSpielbrettFeldZiel(270, 150, 2);
		SpielbrettFeld zf22 = new MADNSpielbrettFeldZiel(240, 150, 2);
		SpielbrettFeld zf23 = new MADNSpielbrettFeldZiel(210, 150, 2);
		SpielbrettFeld zf24 = new MADNSpielbrettFeldZiel(180, 150, 2);
		SpielbrettFeld zf31 = new MADNSpielbrettFeldZiel(150, 30, 4);
		SpielbrettFeld zf32 = new MADNSpielbrettFeldZiel(150, 60, 4);
		SpielbrettFeld zf33 = new MADNSpielbrettFeldZiel(150, 90, 4);
		SpielbrettFeld zf34 = new MADNSpielbrettFeldZiel(150, 120, 4);
		SpielbrettFeld zf41 = new MADNSpielbrettFeldZiel(150, 270, 3);
		SpielbrettFeld zf42 = new MADNSpielbrettFeldZiel(150, 240, 3);
		SpielbrettFeld zf43 = new MADNSpielbrettFeldZiel(150, 210, 3);
		SpielbrettFeld zf44 = new MADNSpielbrettFeldZiel(150, 180, 3);
		
		
		// Nachfolger
		sbf01.setNachfolger(new ArrayList<>(Arrays.asList(sbf02)));
		sbf02.setNachfolger(new ArrayList<>(Arrays.asList(sbf03)));
		sbf03.setNachfolger(new ArrayList<>(Arrays.asList(sbf04)));
		sbf04.setNachfolger(new ArrayList<>(Arrays.asList(sbf05)));
		sbf05.setNachfolger(new ArrayList<>(Arrays.asList(sbf06)));
		sbf06.setNachfolger(new ArrayList<>(Arrays.asList(sbf07)));
		sbf07.setNachfolger(new ArrayList<>(Arrays.asList(sbf08)));
		sbf08.setNachfolger(new ArrayList<>(Arrays.asList(sbf09)));
		sbf09.setNachfolger(new ArrayList<>(Arrays.asList(sbf10)));
		sbf10.setNachfolger(new ArrayList<>(Arrays.asList(sbf11, zf41)));
		sbf11.setNachfolger(new ArrayList<>(Arrays.asList(sbf12)));
		sbf12.setNachfolger(new ArrayList<>(Arrays.asList(sbf13)));
		sbf13.setNachfolger(new ArrayList<>(Arrays.asList(sbf14)));
		sbf14.setNachfolger(new ArrayList<>(Arrays.asList(sbf15)));
		sbf15.setNachfolger(new ArrayList<>(Arrays.asList(sbf16)));
		sbf16.setNachfolger(new ArrayList<>(Arrays.asList(sbf17)));
		sbf17.setNachfolger(new ArrayList<>(Arrays.asList(sbf18)));
		sbf18.setNachfolger(new ArrayList<>(Arrays.asList(sbf19)));
		sbf19.setNachfolger(new ArrayList<>(Arrays.asList(sbf20)));
		sbf20.setNachfolger(new ArrayList<>(Arrays.asList(sbf21, zf21)));
		sbf21.setNachfolger(new ArrayList<>(Arrays.asList(sbf22)));
		sbf22.setNachfolger(new ArrayList<>(Arrays.asList(sbf23)));
		sbf23.setNachfolger(new ArrayList<>(Arrays.asList(sbf24)));
		sbf24.setNachfolger(new ArrayList<>(Arrays.asList(sbf25)));
		sbf25.setNachfolger(new ArrayList<>(Arrays.asList(sbf26)));
		sbf26.setNachfolger(new ArrayList<>(Arrays.asList(sbf27)));
		sbf27.setNachfolger(new ArrayList<>(Arrays.asList(sbf28)));
		sbf28.setNachfolger(new ArrayList<>(Arrays.asList(sbf29)));
		sbf29.setNachfolger(new ArrayList<>(Arrays.asList(sbf30)));
		sbf30.setNachfolger(new ArrayList<>(Arrays.asList(sbf31, zf31)));
		sbf31.setNachfolger(new ArrayList<>(Arrays.asList(sbf32)));
		sbf32.setNachfolger(new ArrayList<>(Arrays.asList(sbf33)));
		sbf33.setNachfolger(new ArrayList<>(Arrays.asList(sbf34)));
		sbf34.setNachfolger(new ArrayList<>(Arrays.asList(sbf35)));
		sbf35.setNachfolger(new ArrayList<>(Arrays.asList(sbf36)));
		sbf36.setNachfolger(new ArrayList<>(Arrays.asList(sbf37)));
		sbf37.setNachfolger(new ArrayList<>(Arrays.asList(sbf38)));
		sbf38.setNachfolger(new ArrayList<>(Arrays.asList(sbf39)));
		sbf39.setNachfolger(new ArrayList<>(Arrays.asList(sbf40)));
		sbf40.setNachfolger(new ArrayList<>(Arrays.asList(sbf01, zf11)));
		
		hf11.setNachfolger(new ArrayList<>(Arrays.asList(sbf01)));
		hf12.setNachfolger(new ArrayList<>(Arrays.asList(sbf01)));
		hf13.setNachfolger(new ArrayList<>(Arrays.asList(sbf01)));
		hf14.setNachfolger(new ArrayList<>(Arrays.asList(sbf01)));
		hf21.setNachfolger(new ArrayList<>(Arrays.asList(sbf21)));
		hf22.setNachfolger(new ArrayList<>(Arrays.asList(sbf21)));
		hf23.setNachfolger(new ArrayList<>(Arrays.asList(sbf21)));
		hf24.setNachfolger(new ArrayList<>(Arrays.asList(sbf21)));
		hf31.setNachfolger(new ArrayList<>(Arrays.asList(sbf31)));
		hf32.setNachfolger(new ArrayList<>(Arrays.asList(sbf31)));
		hf33.setNachfolger(new ArrayList<>(Arrays.asList(sbf31)));
		hf34.setNachfolger(new ArrayList<>(Arrays.asList(sbf31)));
		hf41.setNachfolger(new ArrayList<>(Arrays.asList(sbf11)));
		hf42.setNachfolger(new ArrayList<>(Arrays.asList(sbf11)));
		hf43.setNachfolger(new ArrayList<>(Arrays.asList(sbf11)));
		hf44.setNachfolger(new ArrayList<>(Arrays.asList(sbf11)));
		
		zf11.setNachfolger(new ArrayList<>(Arrays.asList(zf12)));
		zf12.setNachfolger(new ArrayList<>(Arrays.asList(zf13)));
		zf13.setNachfolger(new ArrayList<>(Arrays.asList(zf14)));
		zf21.setNachfolger(new ArrayList<>(Arrays.asList(zf22)));
		zf22.setNachfolger(new ArrayList<>(Arrays.asList(zf23)));
		zf23.setNachfolger(new ArrayList<>(Arrays.asList(zf24)));
		zf31.setNachfolger(new ArrayList<>(Arrays.asList(zf32)));
		zf32.setNachfolger(new ArrayList<>(Arrays.asList(zf33)));
		zf33.setNachfolger(new ArrayList<>(Arrays.asList(zf34)));
		zf41.setNachfolger(new ArrayList<>(Arrays.asList(zf42)));
		zf42.setNachfolger(new ArrayList<>(Arrays.asList(zf43)));
		zf43.setNachfolger(new ArrayList<>(Arrays.asList(zf44)));

		felder.add(sbf01);
		felder.add(sbf02);
		felder.add(sbf03);
		felder.add(sbf04);
		felder.add(sbf05);
		felder.add(sbf06);
		felder.add(sbf07);
		felder.add(sbf08);
		felder.add(sbf09);
		felder.add(sbf10);
		felder.add(sbf11);
		felder.add(sbf12);
		felder.add(sbf13);
		felder.add(sbf14);
		felder.add(sbf15);
		felder.add(sbf16);
		felder.add(sbf17);
		felder.add(sbf18);
		felder.add(sbf19);
		felder.add(sbf20);
		felder.add(sbf21);
		felder.add(sbf22);
		felder.add(sbf23);
		felder.add(sbf24);
		felder.add(sbf25);
		felder.add(sbf26);
		felder.add(sbf27);
		felder.add(sbf28);
		felder.add(sbf29);
		felder.add(sbf30);
		felder.add(sbf31);
		felder.add(sbf32);
		felder.add(sbf33);
		felder.add(sbf34);
		felder.add(sbf35);
		felder.add(sbf36);
		felder.add(sbf37);
		felder.add(sbf38);
		felder.add(sbf39);
		felder.add(sbf40);
		felder.add(hf11);
		felder.add(hf12);
		felder.add(hf13);
		felder.add(hf14);
		felder.add(hf21);
		felder.add(hf22);
		felder.add(hf23);
		felder.add(hf24);
		felder.add(hf31);
		felder.add(hf32);
		felder.add(hf33);
		felder.add(hf34);
		felder.add(hf41);
		felder.add(hf42);
		felder.add(hf43);
		felder.add(hf44);
		felder.add(zf11);
		felder.add(zf12);
		felder.add(zf13);
		felder.add(zf14);
		felder.add(zf21);
		felder.add(zf22);
		felder.add(zf23);
		felder.add(zf24);
		felder.add(zf31);
		felder.add(zf32);
		felder.add(zf33);
		felder.add(zf34);
		felder.add(zf41);
		felder.add(zf42);
		felder.add(zf43);
		felder.add(zf44);
		
	}
	
	public List<SpielbrettFeld> getHeimFelder(int spielerID) {
		return heime.get(spielerID - 1); 
	}
	

}
