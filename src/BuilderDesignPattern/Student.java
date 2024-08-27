package BuilderDesignPattern;

public class Student{
    String name;
    int age;
    int rollNumber;
    String Address;
     public Student(StudentBuilder studentBuilder) {
         name = studentBuilder.name;
         age =  studentBuilder.age;
         rollNumber = studentBuilder.rollNumber;
         Address = studentBuilder.Address;
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return Address;
    }
}
