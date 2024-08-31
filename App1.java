import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App1 {
    public static int x = 350;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Help the Lady Cross the Road");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            private final Image backgroundImage = new ImageIcon(
                    "Images\\99866465-vector-illustration-of-streets-crossing-in-modern-city-city-crossroad-with-traffic-lights-markings.jpg")
                    .getImage(); // Provide the path to your background image

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);
        frame.add(panel);

        ImageIcon icon = new ImageIcon(
                "Images\\pngtree-cartoon-old-lady-with-short-stick-clipart-vector-png-image_6898152.png");

        JLabel imageLabel = new JLabel(icon);
        imageLabel.setSize(icon.getIconWidth(), icon.getIconHeight());
        imageLabel.setLocation(300, 500);
        panel.add(imageLabel);

        // Create the label
        JLabel label = new JLabel("Help The Lady Cross the Road!");
        label.setForeground(Color.RED);
        label.setSize(300, 30);
        label.setLocation(x, 100);
        panel.add(label);

        JButton button = new JButton("Left!");
        button.setBounds(200, 900, 100, 30);
        panel.add(button);

        JButton button2 = new JButton("Right");
        button2.setBounds(600, 900, 100, 30);
        panel.add(button2);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 100;
                label.setText("Good Job!");
                System.out.println("Walked to the Left");
                imageLabel.setLocation(x, 500);
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 100;
                label.setText("Good Job!");
                System.out.println("Walked to the Right");
                imageLabel.setLocation(x, 500);
            }
        });

        frame.setVisible(true);
    }


    }
