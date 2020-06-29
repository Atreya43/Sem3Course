import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TextDemo extends JFrame
implements ActionListener, KeyListener {
	private JTextField field;
	private JTextArea area;
	public static void main(String[] args) {
		(new TextDemo()).setVisible(true);
	}
	TextDemo() {
	super("TextDemo");
	setSize(350, 250);
	Container cont = getContentPane();
	field = new JTextField("");
	field.addKeyListener(this);
	field.addActionListener(this);
	cont.add(field, BorderLayout.NORTH);
	area = new JTextArea();
	cont.add(area, BorderLayout.CENTER);
	}
	public void keyPressed(KeyEvent e) { }
	public void keyReleased(KeyEvent e) { }
	public void keyTyped(KeyEvent e) {
		area.append("KEY: " + e.getKeyChar()+"\n");
	}
	public void actionPerformed(ActionEvent e) {
	area.append("ACTION: " + field.getText()+"\n");
	}
}