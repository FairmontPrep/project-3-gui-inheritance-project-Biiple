public class WandGUI {

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Magic Wand");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            RandomGemWand wand = new RandomGemWand();

            JLabel descriptionLabel = new JLabel(wand.getDescription());
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

            frame.setLayout(new BorderLayout());
            frame.add(wand, BorderLayout.CENTER);
            frame.add(descriptionLabel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
