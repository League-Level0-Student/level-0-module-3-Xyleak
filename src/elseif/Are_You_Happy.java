package elseif;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		int Mood = JOptionPane.showConfirmDialog(null, "Are You Happy?");
		{

			if (Mood == 0)

			{
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
			}

			else if (Mood ==1)
				
			{
				int Mood2 = JOptionPane.showConfirmDialog(null,"Do You Want To Be Happy?");
				
				if(Mood2 == 0)
				
				{
					JOptionPane.showMessageDialog(null, "Change Something.");
				}
				else if(Mood2 == 1)
				{
					JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing. ");
				}
				
			}
			
			
		}
		}
	}
	
