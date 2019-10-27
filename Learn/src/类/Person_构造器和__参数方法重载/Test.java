package 类.Person_构造器和__参数方法重载;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person("红月卡莲");
        System.out.println(cc.getname("喜欢鲁鲁修"));
        System.out.println(cc.getSex());
//        System.out.println(cc.getadd());
//        System.out.println(cc.name);
        System.out.println(cc.sex);
        System.out.println(cc.add);
    }
}

class Person{
    private String name = "jj";
    public String sex = "女";
    protected String add = "布里塔尼亚";

    Person(String name) {
        this.name = name;
    }

    // 方法重载
    public String getname(String ll) {
        return this.name + ll;
    }

    private String getadd() {
        return this.add;
    }

    protected String getSex() {
        return this.sex;
    }
}
