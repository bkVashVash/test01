package 类.抽象类_abstract;

abstract class Food{
    public abstract void addwriter();
    public void drinkwriter(){
        System.out.println("你好，请喝水");
    }
}


public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person();
        cc.addwriter();
        cc.drinkwriter();
    }
}

class Person extends Food {
    @Override
    public void addwriter() {
        String sex = "夏莉-布里塔尼亚";
        System.out.println(sex);
    }

}