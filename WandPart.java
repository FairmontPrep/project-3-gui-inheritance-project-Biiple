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

    protected ImageIcon loadImage(String absolutePath) {
        return new ImageIcon(absolutePath);
    }
}