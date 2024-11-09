package datastructure.generic.ex3;

import datastructure.generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: = " + animal.getName());
        System.out.println("동물 크기: = " + animal.getSize());
        animal.sount();
    }

    public Animal bigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }



}
