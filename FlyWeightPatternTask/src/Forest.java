import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData, int countOfFruits, Location location) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, countOfFruits);
        Tree tree = new Tree(x, y, type, countOfFruits, location);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < 100; i++) {
            Location location = getLocation(i);
            forest.plantTree(random(0, 500), random(0, 500),
                    "Summer Oak", Color.GREEN, "Oak texture stub", random(0, 5), location);
        }
        forest.setSize(500, 500);
        forest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        forest.setVisible(true);
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static Location getLocation(int i) {
        if (i % 3 == 0) {
            return Location.SOUTH;
        } else if (i % 3 == 1) {
            return Location.MIDDLE;
        } else {
            return Location.NORTH;
        }
    }
}
