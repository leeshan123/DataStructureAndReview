package javaking.basic.class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        System.out.println("이름: " + student1.name +" 나이: "+ student1.age +" 성적: "+ student1.grade);

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        Student[] students = {student1,student2};

        for(int i=0; i< students.length; i++){
            Student s = students[i];
            System.out.println("이름: " + s.name +" 나이: "+ s.age +" 성적: "+ s.grade);
        }






    }

}
