package 类.static类方法_实例方法;

public class Test {
    public static void main(String[] args) {
        Person cc = new Person(30);
        cc.print_pop();
        Person vv = new Person(30);
        vv.print_pop();

    }
}

class Person{
    public int height = 70;
    private static int population;
    public Person(int i){
        this.height = i;
        Person.population = Person.population + 1;
    }

    public void print_pop() {
        System.out.println(Person.population);
    }

}