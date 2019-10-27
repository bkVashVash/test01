package 类.组合_has_a;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person();
        cc.drinkwriter();
    }
}

class Person {
    public void drinkwriter() {
        String add = "布里塔尼亚";
        System.out.println(add);
        System.out.println(this.hand.usehand(5));
    }

    public Hands hand = new Hands();

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