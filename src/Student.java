
class Student implements Comparable<Student> {

private int age;

private String name;

public Student(String name, int age){

setName(name);

setAge(age);

}

public void setName(String name){

this.name = name;

}

public void setAge(int age){

this.age = age;

}

public String getName(){

return name;

}

public int getAge(){

return age;

}

@Override

public String toString(){

return "Student " + name + ", his/her age: " + age;

}

@Override

public int compareTo(Student o){

if (age > o.getAge())

return 1;

else if (age == o.getAge())

return 0;

else

return -1;

}

}


