package javaking.basic.poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);

        System.out.println();
        parentCall(parent1);
        parentCall(parent2);

    }

    private static void call(Parent parent){
        //Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child){
            System.out.println("Child 인스턴스가 맞음");
            ((Child) parent).childMethod();
        }else System.out.println("Parent 인스턴스");
    }

    private static void parentCall(Parent parent){
        if(parent instanceof Parent) System.out.println("Parent 인스턴스");
    }
}
