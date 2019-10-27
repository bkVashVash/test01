package 类.接口interface_Override;

interface Cup{
    void addwriter();
    void drinkwriter();
}

interface CCup{
    void WaterContent();
}

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person();
        cc.WaterContent();
    }
}

class Person implements CCup,Cup{
    @Override
    public void addwriter() {
        String sex = "女";
        System.out.println(sex);
    }

    @Override
    public void drinkwriter() {
        String add = "布里塔尼亚";
        System.out.println(add);
    }

    @Override
    public void WaterContent(){
        System.out.println("rrrr");
    }

}