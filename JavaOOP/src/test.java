import model.Student;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("test");
        student.setAge(20);
        student.setGender('M');
        student.setID(12345678);
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getGender() + " " + student.getID());
    }
}
