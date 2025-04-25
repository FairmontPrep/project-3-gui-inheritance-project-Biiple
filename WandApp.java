import javax.swing.*;
import java.awt.*;


public class WandApp extends JFrame {
    WandGem wand;

    public WandApp() {
        setTitle("Magic Wand Generator");
        setSize(320, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        wand = new WandGem();
        wand.setBounds(0, 0, 300, 300);

        JLabel label = new JLabel(wand.getDescription());
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setBounds(10, 310, 300, 50);

        add(wand);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WandApp();
    }
}
