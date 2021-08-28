
public class Main {
    //Задание 1
    public static void main(String[] args) {
    Person p = new Person.Builder().addFirstName("Иван").addLastName("Иванов").addAge(25).build();
        System.out.println(p.getAge());

        System.out.println();

        Triangle t = new Triangle();
        Square s = new Square();
        Circle c  = new Circle();

        t.draw();
        s.draw();
        c.draw();

    }
}