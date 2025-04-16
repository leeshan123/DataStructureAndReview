package datastructure.problem;

public class P_01 {


    public static void main(String[] args) {

        Child child = new Child();

        System.out.println(child.getX());

    }

}

class Parent {
    int x = 100;

    public Parent() {
        this(500);
        System.out.println("2번째 시작");
    }

    public Parent(int x) {
        System.out.println("첫번째 시작");
        this.x = x;
    }

    int getX(){
        return x;
    }

}

class Child extends Parent {
    int x = 2000;

    public Child() {
        this(5000);
        System.out.println("4번째 시작");
    }

    public Child(int x) {
        System.out.println("3번째 시작");
        this.x = x;
    }

}

