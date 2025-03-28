public class Wand with Random Gem {
    class RandomGemWand extends WandAura {

        // Constructor
        public RandomGemWand() {
            super();
            addRandomGem();
        }
    
        // Method to add random gem
        private void addRandomGem() {
            String gemFile;
            if (Math.random() < 0.5) {
                gemFile = "gem_ruby.png";
                description += " topped with a radiant ruby gem!";
            } else {
                gemFile = "gem_emerald.png";
                description += " topped with a sparkling emerald gem!";
            }
    
            try {
                BufferedImage gem = ImageIO.read(new File(gemFile));
                Graphics g = image.getGraphics();
                g.drawImage(gem, 0, 0, null);
                g.dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }w
}
