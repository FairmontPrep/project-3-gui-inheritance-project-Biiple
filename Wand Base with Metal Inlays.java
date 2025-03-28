class WandBase extends Wand {

    // Constructor
    public WandBase() {
        super();
        description += " decorated with fine metal inlays";
    }

    // Load base images
    @Override
    protected void loadImage() {
        try {
            image = ImageIO.read(new File("wand_handle.png"));
            BufferedImage base = ImageIO.read(new File("wand_inlays.png"));
            Graphics g = image.getGraphics();
            g.drawImage(base, 0, 0, null);
            g.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}