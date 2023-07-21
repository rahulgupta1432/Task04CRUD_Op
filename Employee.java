package Task05CRUD_Operation;

import java.util.ArrayList;
import java.util.List;

public class Employee implements CRUDOperations{
    private List<Employee> employees;

    public Employee(String johnDoe, String mail, int i) {
        this.employees = new ArrayList<>();
    }

    @Override
    public void create(Object data) {
        Employee employee = (Employee) data;
        this.employees.add(employee);
    }

    @Override
    public Object read(int id) {
        return this.employees.get(id);
    }

    @Override
    public void update(int id, Object data) {
        Employee employee = (Employee) data;
        this.employees.set(id, employee);
    }

    @Override
    public void delete(int id) {
        this.employees.remove(id);
    }

}

