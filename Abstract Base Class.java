abstract class Wand extends JPanel {

    // Attributes
    protected BufferedImage image;
    protected String description;

    // Constructor
    public Wand() {
        description = "A sturdy wand handle";
        loadImage();
    }

    // Abstract method for loading images
    protected abstract void loadImage();

    // Method to paint component
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    // Getter for description
    public String getDescription() {
        return description;
    }
}