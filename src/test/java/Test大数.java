import java.math.BigInteger;
import java.util.Date;

public class Test大数 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("123456789") ;	// 声明BigInteger对象
        BigInteger bi2 = new BigInteger("987654321") ;	// 声明BigInteger对象
        System.out.println("加法操作：" + bi2.add(bi1)) ;	// 加法操作
        System.out.println("减法操作：" + bi2.subtract(bi1)) ;	// 减法操作
        System.out.println("乘法操作：" + bi2.multiply(bi1)) ;	// 乘法操作
        System.out.println("除法操作：" + bi2.divide(bi1)) ;	// 除法操作
        System.out.println("最大数：" + bi2.max(bi1)) ;	 // 求出最大数
        System.out.println("最小数：" + bi2.min(bi1)) ;	 // 求出最小数
        BigInteger result[] = bi2.divideAndRemainder(bi1) ;	// 求出余数的除法操作
        System.out.println("商是：" + result[0] +
                "；余数是：" + result[1]) ;
        Date date=new Date();
        System.out.printf("%tD%n",date);

        char ch1=97;
        char ch2='a';
        System.out.println(" ch1="+ch1);
        System.out.println(" ch2="+ch2);
        char c;
        c = 'a';

    }
}
