package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q12 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

double ans=L1.stream().filter(e->e.getCompany().equalsIgnoreCase("Wipro")).filter(e->e.getSalary()>40000).mapToDouble(Employee::getSalary).average().orElse(0);System.out.println(ans);
    }
}
