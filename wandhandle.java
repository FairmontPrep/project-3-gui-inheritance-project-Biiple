import javax.swing.*;
import java.awt.*;

class WandHandle extends WandBase {
    protected ImageIcon handleImage;

    public WandHandle() {
        super();
        handleImage = loadImage("image/wand_handle.png", 80, 70);
        description += "Added wand handle. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        handleImage.paintIcon(this, g, 80, 60);
    }
}
