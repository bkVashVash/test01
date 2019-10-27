package 类.循环;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法, 类方法
        Person cc = new Person();
        cc.leavecc2(20);
    }
}

class Person{
    void leavecc2(int req) {
        System.out.println("夏日的黎明");
        int i;
        for(i=0;i<req;i++){
            this.returncc();
        }
    }
    //    实例方法
    void returncc() {
        System.out.println(this.height);
    }

    int height = 20;
}