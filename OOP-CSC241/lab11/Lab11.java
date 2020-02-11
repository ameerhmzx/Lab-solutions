import java.util.ArrayList;

public class Lab11 {
    public static void main(String[] args) {
        Student std1 = new Student("Student 1", 12);
        Student std2 = new Student("Student 2", 13);

        Department department = new Department();
        department.setName("Test Depart");
        department.addStudent(std1);
        department.addStudent(std2);
    }
}

class Department {
    private String name;
    private ArrayList<Student> students;

    Department() {
        this.name = "";
        this.students = new ArrayList<Student>();
    }

    Department(String t, ArrayList<Student> a) {
        this.name = t;
        this.students = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student std) {
        this.students.add(std);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Student {
    private String name;
    private int age;

    Student() {
        this.name = "";
        this.age = 0;
    }

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
