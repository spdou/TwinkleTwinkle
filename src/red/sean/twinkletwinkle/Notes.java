package red.sean.twinkletwinkle;

import lejos.nxt.Sound;

public class Notes {
/*notes are C D E F G A in 4th octave
 * all notes defined as 750ms, this is a quarter note in 80bpm 4/4 time
 */
	
	public static void playC() {
		Sound.playNote(Sound.PIANO, 262, 750);
	}
		
	public static void playD() {
		Sound.playNote(Sound.PIANO, 294, 750);
	}
		
	public static void playE() {
		Sound.playNote(Sound.PIANO, 330, 750);
	}
	
	public static void playF() {
		Sound.playNote(Sound.PIANO, 349, 750);
	}
	
	public static void playG() {
		Sound.playNote(Sound.PIANO, 392, 750);
	}
	
	public static void playA() {
		Sound.playNote(Sound.PIANO, 440, 750);
	}
	
	public static void rest() {
		try {
		    Thread.sleep(750);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
}