import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FileChooserDemo extends JFrame{

   private JFrame mainFrame;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public FileChooserDemo(){
      super("Java Swing Examples");
      setSize(400,400);
      setLayout(new GridLayout(2, 1));
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      statusLabel = new JLabel("",JLabel.CENTER);

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      add(controlPanel);
      add(statusLabel);

      final JFileChooser  fileDialog = new JFileChooser();
      JButton showFileDialogButton = new JButton("Open File");
      showFileDialogButton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
			 //int showOpenDialog(Component parent)
            int returnVal = fileDialog.showOpenDialog(controlPanel);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               java.io.File file = fileDialog.getSelectedFile();
               statusLabel.setText("File Selected :"
               + file.getName());
            }
            else{
               statusLabel.setText("Open command cancelled by user." );
            }
         }
      });
      controlPanel.add(showFileDialogButton);
      setVisible(true);
   }

   public static void main(String[] args){
         new FileChooserDemo();
   }
}