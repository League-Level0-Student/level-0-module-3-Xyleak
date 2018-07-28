//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String Cats = JOptionPane.showInputDialog(null, "H0w m4Ny c4Ts U G000t!??!?!??! OPTIONS: (1, 2, 3, A Ton, or 0");
	
int numCats = Integer.parseInt(Cats);

if(Cats.equals("1")) JOptionPane.showMessageDialog(null, "Oh Ok...");
if(Cats.equals("2")) JOptionPane.showMessageDialog(null, "Oh Ok...");
if(Cats.equals("3")) JOptionPane.showMessageDialog(null, "-_-");
if(Cats.equals("A Ton")) JOptionPane.showMessageDialog(null, ";-; wH4T R Uuuu Th1nkkkInng!?!?!?!?");
else if(Cats.equals("0")) JOptionPane.showMessageDialog(null,  "Good..");
	}



		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		
//video    https://www.youtube.com/watch?v=cijXcKxluZ8		


	static void playVideo(String videoURL) {
		try { 
			URI uri = new URI(videoURL);  
           java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

