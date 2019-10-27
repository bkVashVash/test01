package 类.封装_public_private_protected;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person("红月卡莲");
        System.out.println(cc.getname());
        System.out.println(cc.getAdd());
//        System.out.println(cc.getSex());
//        System.out.println(cc.name);
        System.out.println(cc.sex);
        System.out.println(cc.add);
    }
}

class Person{
    private String name;
    public String sex = "女";
    protected String add = "布里塔尼亚";

    // 构造方法 2
    Person(String name){
        this.name = name;
    }

    String getname() {
        return this.name;
    }

    private String getSex() {
        return this.sex;
    }

    protected String getAdd() {
        return this.add;
    }

}