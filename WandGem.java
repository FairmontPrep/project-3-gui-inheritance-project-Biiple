import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class WandGem extends WandShaft {
    protected ImageIcon gemImage;
    private boolean rubyChosen;

    public WandGem() {
        super();
        rubyChosen = Math.random() > 0.5;
        if (rubyChosen) {
            gemImage = loadImage("/Users/username/Desktop/wand_gem_ruby.png");
            description += "Chose Ruby Gem 💎. ";
        } else {
            gemImage = loadImage("/Users/username/Desktop/wand_gem_emerald.png");
            description += "Chose Emerald Gem ✨. ";
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        gemImage.paintIcon(this, g, 0, 0);
    }
}