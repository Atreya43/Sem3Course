
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorChooserDialog extends JFrame {

    private JPanel panel;
    private JPanel display;

    public ColorChooserDialog() {

        setTitle("ColorChooserDialog");

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        ImageIcon open = new ImageIcon("4.png");

        JToolBar toolbar = new JToolBar();
        JButton openb = new JButton(open);

        openb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JColorChooser clr = new JColorChooser();
				//public static Color showDialog(Component component,String title, Color initialColor)

                Color color = clr.showDialog(panel, "Choose Color", Color.white);
                display.setBackground(color);
            }
        });

        toolbar.add(openb);

        display = new JPanel();
        display.setBackground(Color.WHITE);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.add(display);
        add(panel);

        add(toolbar, BorderLayout.NORTH);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ColorChooserDialog();
    }
}