//Revised
import javax.swing.JFrame;
public class RevisedSimplestSwing{
	public static void main(String[] args){
		//Create Frame
		JFrame frame=new JFrame("SimplestSwing");
		//Set the default behavior to exit the application
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the x,y witdth and height properties in one go
		frame.setBounds(50,50,200,200);
		//Display the frame
		frame.setVisible(true);
	}
}
