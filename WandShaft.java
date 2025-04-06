import javax.swing.*;
import java.awt.*;


class WandShaft extends WandHandle {
    protected ImageIcon shaftImage;

    public WandShaft() {
        super();
        shaftImage = loadImage("image/wand_shaft.png", 80, 90);
        description += "Added wand shaft. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        shaftImage.paintIcon(this, g, 80, 20);
    }
}