package chapter3.inheritance.aggregation;

public class Employee {
    Person person;
    float salary;

    public Employee(Person person, float salary) {
        this.person = person;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Address a1 = new Address("ST", "GUJ", "IND");
        Address a2 = new Address("NVS", "GUJ", "IND");
        Person p1 = new Person("Tirth", "Lakhani", "R", a1);
        Person p2 = new Person("Om", "Sonani", "K", a2);
        Employee e1 = new Employee(p1, 20000f);
        Employee e2 = new Employee(p2, 30000f);

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("\tFULL NAME\t \t ADDRESS \t \t SALARY \t");
        e1.Display();
        e2.Display();
    }

    public void Display() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println(this.person.lname + " " + this.person.fname + " " + this.person.mname + "    " + person.address.city + ", " + person.address.state + ", " + person.address.country + "\t\t" + salary);
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
