package 类.class类_导致了多态和运行时识别;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person();
//        cc.drinkwriter();
        Class c1 = cc.getClass();
        System.out.println(c1.getName());

        Hands vv = new Hands();
        Class c2 = vv.getClass();
        System.out.println(c2.getMethods());
//
//        Class c3 = Class.forName("Person");
//        System.out.println(c3.getName());

        Class c4 = Hands.class;
        System.out.println(c4.getName());


    }
}

class Person extends Hands{
    public void drinkwriter() {
        String add = "布里塔尼亚";
        System.out.println(add);
        System.out.println(this.usehand(20));
    }

}

class Hands{
    public int weight = 10;

    public boolean usehand(int p){
        if (this.weight > p){
            return true;
        }else {
            return false;
        }
    }
}