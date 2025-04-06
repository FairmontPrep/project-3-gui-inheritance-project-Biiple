import javax.swing.*;
import java.awt.*;

class WandBase extends WandPart {
    protected ImageIcon baseImage;

    public WandBase() {
        super();
        baseImage = loadImage("image/wand_base.png", 80, 80);
        description += "Added wand base. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        baseImage.paintIcon(this, g, 80, 100);
    }
}
