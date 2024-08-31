import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;


public class App2 {
    private static JPanel messagePanel;
    public static void main(String [] elton){

        JFrame frame  = new JFrame("Akong Siopao <3");

        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){

            private final Image backgroundImage = new ImageIcon("Images/456246687_532138942633743_4728210757462517408_n.jpg").getImage();

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

            }

            };

            panel.setLayout(null);
            frame.add(panel);

            messagePanel = new JPanel();
            messagePanel.setOpaque(false);
            messagePanel.setBounds(50,50,200,100);
            messagePanel.setLocation(100,100);
            
            JLabel label1 = new JLabel("Ibog biya ko nimo <3");
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            messagePanel.add(label1, BorderLayout.CENTER);

            Border border = BorderFactory.createLineBorder(Color.CYAN, 2);
            messagePanel.setBorder(border);

            messagePanel.setVisible(false);
            panel.add(messagePanel);
            
          

           frame.setVisible(true);

    

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage();
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();

        frame.setVisible(true);
    }

    // Method to make messagePanel visible
    public static void showMessage() {
        if (messagePanel != null) {
            messagePanel.setVisible(true);
        }


    
        }


    

        


    }


