package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q14 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

System.out.println(L1.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.averagingDouble(Employee::getSalary))));
    }
}
