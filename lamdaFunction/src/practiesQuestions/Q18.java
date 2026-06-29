package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q18 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

L1.stream().collect(Collectors.groupingBy(Employee::getCompany)).forEach((k,v)->{System.out.println(k);v.stream().sorted(java.util.Comparator.comparing(Employee::getSalary)).forEach(System.out::println);});
    }
}
