import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData, int countOfFruits) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            if (countOfFruits > 0) {
                result = new FruitTreeType(name, color, otherTreeData, countOfFruits);
            } else {
                result = new TreeType(name, color, otherTreeData);
            }
            treeTypes.put(name, result);
        }
        return result;
    }
}
