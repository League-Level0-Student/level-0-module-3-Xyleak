//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot Xybot = new Robot();
		
		String Color = JOptionPane.showInputDialog(null, "Pick A Color Red, Blue, Yellow, Black, Or Random");
		
		{
			if(Color.equals("Red"));{ Xybot.setPenColor(java.awt.Color.RED);
			}
		
		
		{
			if(Color.equals("Blue"));{ Xybot.setPenColor(java.awt.Color.BLUE);
			}
		
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color
         
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Xybot.penDown();
Xybot.move(999999);

	}

}
}
}