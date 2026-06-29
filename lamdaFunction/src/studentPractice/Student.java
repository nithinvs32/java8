package studentPractice;

public class Student {

    private String name;
    private String qualification;
    private String yearOfPassedOut;
    private double percentage;
    private String gender;

    public Student(String name, String qualification, String yearOfPassedOut,
                   double percentage, String gender) {
        this.name = name;
        this.qualification = qualification;
        this.yearOfPassedOut = yearOfPassedOut;
        this.percentage = percentage;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getYearOfPassedOut() {
        return yearOfPassedOut;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " | " + qualification + " | "
                + yearOfPassedOut + " | " + percentage + "% | " + gender;
    }
}