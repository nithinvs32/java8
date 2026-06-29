package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q9 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

L1.stream().sorted(java.util.Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).forEach(System.out::println);
    }
}
