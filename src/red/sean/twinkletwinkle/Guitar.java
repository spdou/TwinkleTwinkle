package red.sean.twinkletwinkle;

import lejos.nxt.Motor;
import lejos.robotics.RegulatedMotor;

public class Guitar {
	static RegulatedMotor fretMotor = Motor.A;
	static RegulatedMotor pickMotor = Motor.B;

	public static int getLastPickedString = 2;
	public static boolean isInsideStrings = true;
	
	public static void letRing() {
		try {
		    Thread.sleep(675);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public static void playC() {
		fretMotor.rotateTo(0);
		
		if (isInsideStrings == true){
			pickMotor.rotate(20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(-20);
			isInsideStrings = true;
			
		}
		getLastPickedString = 2;
		letRing();
	}
	public static void playD() {
		fretMotor.rotateTo(-30);
		
		if (isInsideStrings == true){
			pickMotor.rotate(20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(-20);
			isInsideStrings = true;
			
		}
		getLastPickedString = 2;
		letRing();
	}
	public static void playE() {
		fretMotor.rotateTo(30);
		
		if (isInsideStrings == true){
			pickMotor.rotate(20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(-20);
			isInsideStrings = true;
		}
		getLastPickedString = 2;
		letRing();
	}
	public static void playF() {
		fretMotor.rotateTo(0);
		
		if (isInsideStrings == true){
			pickMotor.rotate(-20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-20);
			isInsideStrings = true;
		}
		getLastPickedString = 1;
		letRing();
	}
	public static void playG() {
		fretMotor.rotateTo(-30);
		
		if (isInsideStrings == true){
			pickMotor.rotate(-20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-20);
			isInsideStrings = true;
		}
		getLastPickedString = 1;
		letRing();
	}
	public static void playA() {
		fretMotor.rotateTo(30);
		
		if (isInsideStrings == true){
			pickMotor.rotate(-20);
			isInsideStrings = false;
		}
		else if (isInsideStrings == false & getLastPickedString == 2){
			pickMotor.rotate(340);
			isInsideStrings = true;
		}
		else if (isInsideStrings == false & getLastPickedString == 1){
			pickMotor.rotate(-20);
			isInsideStrings = true;
		}
		getLastPickedString = 1;
		letRing();
	}
}