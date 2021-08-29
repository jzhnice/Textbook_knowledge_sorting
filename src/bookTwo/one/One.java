package bookTwo.one;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-26 10:27
 */
public class One {
    public String name = "无名";
    public String age = "男";

    public  One() {
        this.name = "山姆";
        this.age = "女";
    }

    public boolean print() {
        System.out.println("one的自白：\n我的昵称叫" + this.name + ",性别是" + this.age + "");
        return true;
    }

}
