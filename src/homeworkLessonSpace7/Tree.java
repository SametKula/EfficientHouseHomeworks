package homeworkLessonSpace7;

public class Tree {
    public String name = "Tree" + treeCount;
    public static String entityName = "Tree";
    public static int treeCount;

    public static void treeMethod () {
        System.out.println("its a tree methot *some tree sound*");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
    }
}
