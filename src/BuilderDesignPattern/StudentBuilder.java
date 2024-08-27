package BuilderDesignPattern;

public class StudentBuilder {
    String name;
    int age;
    int rollNumber;
    String Address;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAddress(String Address){
        this.Address = Address;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
