import javax.swing.*;
import java.awt.*;


class WandHandle extends WandBase {
    protected ImageIcon handleImage;

    public WandHandle() {
        super();
        handleImage = loadImage("/Users/username/Desktop/wand_handle.png");
        description += "Added wand handle. ";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        handleImage.paintIcon(this, g, 0, 0);
    }
}
