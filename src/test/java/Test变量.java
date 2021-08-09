public class Test变量 {
    public static void main(String[] args) {
        num n = new num();
        n.add();
        n.add();

    }
}
class num{
    int x  = 0;
    void  add() {
        x++;
        System.out.println(x);
    }
}