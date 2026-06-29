package lamdaFunction;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " - " + salary;
	}
}

public class Filter {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", 30000), new Employee("Alice", 35000),
				new Employee("Bob", 40000));

		List<Employee> updatedEmployees = employees.stream()
				.map(emp -> new Employee(emp.getName(), emp.getSalary() + 2000)).collect(Collectors.toList());

		System.out.println(updatedEmployees);
	}
}
