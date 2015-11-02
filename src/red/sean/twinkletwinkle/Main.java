package red.sean.twinkletwinkle;

import lejos.nxt.Button;

public class Main {

	public static void main(String[] args) {
		
		Button.waitForAnyPress();
		
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		Guitar.fretMotor.setSpeed(360);
		Guitar.pickMotor.setSpeed(720);
		
		//twinkle twinkle...
		Guitar.playC();
		Guitar.playC();
		Guitar.playG();
		Guitar.playG();
		Guitar.playA();
		Guitar.playA();
		Guitar.playG();
		Guitar.letRing();
		
		//how I wonder...
		Guitar.playF();
		Guitar.playF();
		Guitar.playE();
		Guitar.playE();
		Guitar.playD();
		Guitar.playD();
		Guitar.playC();
		Guitar.letRing();
		
		//up above...
		Guitar.playG();
		Guitar.playG();
		Guitar.playF();
		Guitar.playF();
		Guitar.playE();
		Guitar.playE();
		Guitar.playD();
		Guitar.letRing();
		
		//like a diamond...
		Guitar.playG();
		Guitar.playG();
		Guitar.playF();
		Guitar.playF();
		Guitar.playE();
		Guitar.playE();
		Guitar.playD();
		Guitar.letRing();
		
		//twinkle twinkle...
		Guitar.playC();
		Guitar.playC();		
		Guitar.playG();
		Guitar.playG();
		Guitar.playA();
		Guitar.playA();
		Guitar.playG();
		Guitar.letRing();
				
		//how I wonder...
		Guitar.playF();
		Guitar.playF();
		Guitar.playE();
		Guitar.playE();
		Guitar.playD();
		Guitar.playD();
		Guitar.playC();
		Guitar.letRing();
		
		Button.waitForAnyPress();
	}
}