public class TestRef {
    public static void main(String[] args) throws ClassNotFoundException {
        Test t = new Test();
        Class<?> clz = Class.forName("Tree.TreeNode");
        Class<?> clz1 = Test.class;
        Class<?> clz2 = t.getClass();


    }
}
