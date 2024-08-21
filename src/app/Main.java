package app;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Eva","Zaslavskaya",
                "Developer in the near future...", "Not found :(",
                ":Not exist",20);

        employee.display();

        Car car = new Car();
        car.start();
    }
}
