import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImplUsingHashSet {

    public static void main(String[] args) {

        StudentImplUsingHashSet studentImplUsingHashSet = new StudentImplUsingHashSet();
        Set<Student> student;
        student = studentImplUsingHashSet.createSet();
        studentImplUsingHashSet.display(student);

        boolean result = studentImplUsingHashSet.removeRollNo(student, 3);
        studentImplUsingHashSet.display(student);

    }

    public Set<Student> createSet() {
        Set<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("Aman", 1, 10));
        studentHashSet.add(new Student("Vaibhav", 2, 9));
        studentHashSet.add(new Student("Ramesh", 3, 8));

        return studentHashSet;
    }

    public void display(Set<Student> student) {
        Iterator<Student> iterator = student.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }

    }

    public boolean removeRollNo(Set<Student> student, int rollNo) {
        boolean response = false;

        Iterator<Student> iterator = student.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getRollNo() == rollNo) {
                iterator.remove();
                response = true;
                break;
            }
        }

        return response;
    }
}
