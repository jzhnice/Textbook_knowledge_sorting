package bookTwo.one.Three;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-29 09:30
 */
public class InnerClassTest {
    public int outFiled1 = 1;
    protected int outFiled2 = 2;
    int outFiled3 = 3;
    private int outFiled4 = 4;

    public InnerClassTest() {
        InnerClass innerObj = new InnerClass();
        System.out.println("创建" + this.getClass().getSimpleName() + "对象");
        System.out.println("其内部类Outfiled1字段的值为" + innerObj.outFiled5);
        System.out.println("其内部类outFiled2的值为" + innerObj.outFiled6);
        System.out.println("其内部类outFiled3的值为" + innerObj.outFiled7);
        System.out.println("其内部类outFiled4的值为" + innerObj.outFiled8);
    }

    public class InnerClass {
        public int outFiled5 = 5;
        protected int outFiled6 = 6;
        int outFiled7 = 7;
        private int outFiled8 = 8;


        public InnerClass() {
            System.out.println("创建" + this.getClass().getSimpleName() + "对象");
            System.out.println("其内部类Outfiled1字段的值为" + outFiled1);
            System.out.println("其内部类Outfiled2字段的值为" + outFiled2);
            System.out.println("其内部类Outfiled3字段的值为" + outFiled3);
            System.out.println("其内部类Outfiled4字段的值为" + outFiled4);

        }
    }

    public static void main(String[] args) {
        InnerClassTest outerObject = new InnerClassTest();
        InnerClass innerobj = outerObject.new InnerClass();
    }
}
