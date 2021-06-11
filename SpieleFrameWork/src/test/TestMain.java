package test;

import test.model.MADN;
import view.SpielFrame;

public class TestMain {

	
	public static void main(String [] args) {
		
		MADN madn = new MADN();
		
		SpielFrame sf = new SpielFrame(madn);
		sf.requestFocus();
	}
	
}
