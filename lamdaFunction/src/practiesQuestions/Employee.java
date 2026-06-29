package practiesQuestions;

public class Employee {
    private String name;
    private String company;
    private double salary;

    public Employee(String name,String company,double salary){
        this.name=name;
        this.company=company;
        this.salary=salary;
    }

    public String getName(){ return name; }
    public String getCompany(){ return company; }
    public double getSalary(){ return salary; }
    public void setSalary(double salary){ this.salary=salary; }

    @Override
    public String toString(){
        return name+" "+company+" "+salary;
    }
}
