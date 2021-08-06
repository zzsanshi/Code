package 设计模式.结构型.适配器;
//适配器类,
public class Adapter extends Adaptee implements Target{
    //进行混合
    @Override
    public void request() {
        //...一些操作...
        super.adapteeRequest();
        //...一些操作...
    }
}
