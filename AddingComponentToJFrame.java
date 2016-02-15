import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

public class AddingComponentToJFrame{
	public static void main(String[] args){
		JFrame frame=new JFrame("Adding Component to Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		//Add a close button
		JButton closeButton=new JButton("Close");
		contentPane.add(closeButton);
		//set the size
		frame.setBounds(50,50,200,200);
		frame.setVisible(true);
	}
}
