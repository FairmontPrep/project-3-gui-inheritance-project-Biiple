import javax.swing.*;
import java.awt.*;


public class WandPart extends JPanel {
    protected String description;

    public WandPart() {
        this.description = "Building a magical wand: ";
    }

    public String getDescription() {
        return description;
    }

    protected ImageIcon loadImage(String absolutePath, int width, int height) {
        ImageIcon original = new ImageIcon(absolutePath);
        Image scaled = original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
}