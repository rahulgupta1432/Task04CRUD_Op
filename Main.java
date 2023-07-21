package Task05CRUD_Operation;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "johndoe@gmail.com", 123);
        employee.create(new Employee("John Doe", "johndoe@gmail.com", 123));
        employee.create(new Employee("Jane Doe", "janedoe@gmail.com", 9876));

        Employee johnDoe= (Employee) employee.read(0);
        System.out.println(johnDoe);

        employee.update(0, new Employee("Jane Doe", "janedoe@yahoo.com", 9876));

        employee.delete(1);

        System.out.println(employee.employees.size());
    }

}