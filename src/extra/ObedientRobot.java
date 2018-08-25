package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot Lowercase = new Robot();
	public static void main(String[] args) {
ObedientRobot Lowercase1 = new ObedientRobot();
	
	
String Shape = JOptionPane.showInputDialog("What Shape Would You Like? (Circle, Square, Or Triangle?)");
String Color = JOptionPane.showInputDialog("What Color Would You Like? Blue Or Red?");	


if(Color.equals("Blue")) {
	Lowercase1.Lowercase.setPenColor(0,0,255);
}

else if(Color.equals("Red")) {
	Lowercase1.Lowercase.setPenColor(255,0,0);
}





if (Shape.equals("Circle")) {
	Lowercase1.drawCircle();
}

else if(Shape.equals("Triangle")) {
	Lowercase1.drawTriangle();}


else if(Shape.equals("Square")) {
	Lowercase1.drawSquare();}
}

	
	public void colorblue() {
		Lowercase.setPenColor(0,0,255);
	}
	
	public void colorred() {
		Lowercase.setPenColor(255,0,0);
	}

		
		
public void drawCircle() {
	Lowercase.setSpeed(999);
	Lowercase.penDown();
	for (int i = 0; i < 360; i++) {
	Lowercase.move(1);
	Lowercase.turn(1);
	}	
	Lowercase.hide();	
}
	
	
	public void drawTriangle() {
		Lowercase.setSpeed(999);
		Lowercase.penDown();
		for (int i = 0; i < 3; i++) {
			Lowercase.move(100);
	Lowercase.turn(360 /3);
		}

		Lowercase.hide();
			
	}
	
	public void drawSquare(){
		Lowercase.setSpeed(999);
	Lowercase.penDown();
	for (int i = 0; i < 4; i++) {
		
	
	
	
	Lowercase.move(100);
	Lowercase.turn(90);
	
	
	
	
	
	
		
	}
	
	
	Lowercase.hide();
	
}
}



