package javaking.generic.ex3;

import javaking.generic.animal.Cat;


public class CatHospital {

    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sount();
    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }


}
