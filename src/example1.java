
import java.util.SortedSet;
import java.util.TreeSet;

public class example1 {

public static void main(String [] args){

SortedSet<Student> students = new TreeSet<Student>();

Student studentArray [] = {

new Student("John", 30),

new Student("Olzhas", 25),

new Student("Laura", 33),

new Student("Mina", 40),

new Student("Diana", 28),

new Student("Mohamed", 32)

};

for (int i = 0; i < studentArray.length; i++)

students.add(studentArray[i]);

System.out.println("Set after sorting: ");

for (Student s : students)

System.out.println(s);

}

}