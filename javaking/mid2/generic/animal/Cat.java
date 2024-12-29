package javaking.mid2.generic.animal;

public class Cat extends Animal{

    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sount() {
        System.out.println("냐옹");
    }
}
