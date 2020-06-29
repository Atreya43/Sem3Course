import java.awt.*;
import javax.swing.*;
public class RadioDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Radio Demo");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton rbtn = new JRadioButton("Rare", true);
		btnGroup.add(rbtn);
		cont.add(rbtn);
		rbtn = new JRadioButton("Medium");
		btnGroup.add(rbtn);
		cont.add(rbtn);
		rbtn = new JRadioButton("Well Done");
		btnGroup.add(rbtn);
		cont.add(rbtn);
		frame.setVisible(true);
 	}
 }