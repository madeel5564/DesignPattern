import java.awt.*;

public class Tree implements FruitTree {
    private int x;
    private int y;
    private TreeType type;
    private int countOfFruits;
    private Location location;

    public Tree(int x, int y, TreeType type, int countOfFruits, Location location) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.countOfFruits = countOfFruits;
        this.location = location;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y, this, location);
    }

    @Override
    public boolean isFruitTree() {
        return type instanceof FruitTree;
    }

    @Override
    public int getCountOfFruits() {
        return countOfFruits;
    }
}
