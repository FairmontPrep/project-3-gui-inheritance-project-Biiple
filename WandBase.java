import javax.swing.*;
import java.awt.*;


class WandBase extends WandPart {
    protected ImageIcon baseImage;

    public WandBase() {
        super();
        baseImage = loadImage("/Users/username/Desktop/wand_base.png");
        description += "Added wand base. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        baseImage.paintIcon(this, g, 0, 0);
    }
}