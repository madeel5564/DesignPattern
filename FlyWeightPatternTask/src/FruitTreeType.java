import java.awt.*;

public class FruitTreeType extends TreeType {
    private int countOfFruits;

    public FruitTreeType(String name, Color color, String otherTreeData, int countOfFruits) {
        super(name, color, otherTreeData);
        this.countOfFruits = countOfFruits;
    }

    @Override
    public boolean isFruitTree() {
        return true;
    }

    @Override
    public int getCountOfFruits() {
        return countOfFruits;
    }
}
