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
            gemImage = loadImage("image/wand_gem_ruby.png", 80, 60);
            description += "Chose Ruby Gem 💎 (red crystal top). ";
        } else {
            gemImage = loadImage("image/wand_gem_emerald.png", 80, 60);
            description += "Chose Emerald Gem ✨ (green crystal top). ";
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        gemImage.paintIcon(this, g, 80, 30);
    }
}