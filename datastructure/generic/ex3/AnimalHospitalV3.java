package datastructure.generic.ex3;


import datastructure.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용


        System.out.println("동물 이름: = " + animal.getName());
        System.out.println("동물 크기: = " + animal.getSize());
        animal.sount();
    }

    public T bigger(T target){

        return animal.getSize() > target.getSize() ? animal : target;
    }



}
