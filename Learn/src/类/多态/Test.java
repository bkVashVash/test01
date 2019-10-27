package 类.多态;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Human cc = new Human();
        LuLu vv = new LuLu();

        // 使用衍生类为参数，调用了衍生类的方法
        // 基类   自动转化成  衍生类
        cc.drink(vv);
    }
}

class Human{
    // 参数为基类
    void drink (Person aPeson){
        aPeson.drinkwriter();
    }
}

class LuLu extends Person {
    LuLu(){
        System.out.println("我是露露的构造方法");
    }

    @Override
    public void drinkwriter() {
//        super.drinkwriter();
        System.out.println("红月卡莲");
    }
}

class Person {
    Person(){
        int i = 20;
        System.out.println(i);
    }

    public void addwriter() {
        String sex = "女";
        System.out.println(sex);
    }

    public void drinkwriter() {
        String add = "布里塔尼亚";
        System.out.println(add);
    }

}