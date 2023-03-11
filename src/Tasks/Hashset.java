package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student("dave",123));
        students.add(new Student("davin",423));
        students.add(new Student("ron",143));
        students.add(new Student("kain",1273));

    }
}
class Student{
    private String name;
    private int studentID;
    public Student(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
    public String getName(){
        return name;
    }
    public int getStudentID(){
    return studentID;
    }

}
