import java.awt.*;

public class FruitTreeDecorator {
    public static void decorateWithFruits(Graphics g, int x, int y, int countOfFruits) {
        for (int i = 0; i < countOfFruits; i++) {
            g.setColor(Color.RED);
            g.fillOval(x - 5 + i * 3, y - 20, 5, 5);
        }
    }
}
