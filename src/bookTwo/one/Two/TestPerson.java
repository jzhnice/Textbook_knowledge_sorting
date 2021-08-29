package bookTwo.one.Two;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-08-26 10:51
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.Print();
        person = new Person("李四");
        person.Print();
        person = new Person("小李","女");
        person.Print();





    }
}
