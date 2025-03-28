class WandAura extends WandBase {

    // Constructor
    public WandAura() {
        super();
        description += " enveloped by a magical glowing aura";
    }

    // Load aura image
    @Override
    protected void loadImage() {
        super.loadImage();
        try {
            BufferedImage aura = ImageIO.read(new File("wand_aura.png"));
            Graphics g = image.getGraphics();
            g.drawImage(aura, 0, 0, null);
            g.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
w