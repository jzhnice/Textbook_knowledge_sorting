package bookTwo.one.Two;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-26 10:48
 */
public class Person {
    public String name = "无名";
    public String sex = "男";

    public  Person() {
        this.name = "山姆";
        this.sex = "女";
    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name,String sex){
        super();
        this.name = name;
        this.sex = sex;
    }
    public void Print(){
        System.out.println("Person的自白：\n我的昵称叫" + this.name + ",性别是" + this.sex + "");
    }
}
