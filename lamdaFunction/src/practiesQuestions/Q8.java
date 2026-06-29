package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q8 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

L1.stream().filter(e->e.getSalary()>=40000&&e.getSalary()<=90000).sorted(java.util.Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
    }
}
