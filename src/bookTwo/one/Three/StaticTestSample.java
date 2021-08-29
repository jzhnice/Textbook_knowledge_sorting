package bookTwo.one.Three;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-26 10:59
 */
public class StaticTestSample {

    static int j;
    static int s = 80;
    int i;
    int k = 55;

    static {
        j = 5;
        System.out.println("得到j的初始化值为：" + j);
    }

    public StaticTestSample() {
        i = 20;
        System.out.println("i的初始值为：" + i);
    }

    public void getNum() {
        System.out.println("得到j的值为：" + j);
    }

    public static void main(String[] args) {
        StaticTestSample ST = new StaticTestSample();
        System.out.println("j的值为：" + StaticTestSample.j);
        ST.getNum();
        System.out.println("s的值为：" + StaticTestSample.s);
        System.out.println("k的值为：" + ST.k);
    }
}
