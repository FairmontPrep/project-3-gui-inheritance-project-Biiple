import javax.swing.*;
import java.awt.*;


class WandShaft extends WandHandle {
    protected ImageIcon shaftImage;

    public WandShaft() {
        super();
        shaftImage = loadImage("/Users/username/Desktop/wand_shaft.png");
        description += "Added wand shaft. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        shaftImage.paintIcon(this, g, 0, 0);
    }
}
