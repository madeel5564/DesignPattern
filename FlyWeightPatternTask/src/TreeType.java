import java.awt.*;

public class TreeType implements FruitTree {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y, FruitTree tree, Location location) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);

        int sizeFactor = getSizeFactor(location);
        g.fillOval(x - 5 * sizeFactor, y - 10 * sizeFactor, 10 * sizeFactor, 10 * sizeFactor);

        if (tree.isFruitTree()) {
            FruitTreeDecorator.decorateWithFruits(g, x, y, tree.getCountOfFruits());
        }
    }

    @Override
    public boolean isFruitTree() {
        return false;
    }

    @Override
    public int getCountOfFruits() {
        return 0;
    }

    private int getSizeFactor(Location location) {
        switch (location) {
            case SOUTH:
                return 3;
            case MIDDLE:
                return 2;
            case NORTH:
                return 1;
            default:
                return 1;
        }
    }
}
