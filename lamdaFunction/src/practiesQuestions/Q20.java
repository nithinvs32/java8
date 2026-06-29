package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q20 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

L1.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.summarizingDouble(Employee::getSalary))).forEach((k,v)->System.out.println(k+" Min="+v.getMin()+" Max="+v.getMax()));
    }
}
