package datastructure.generic.ex3;

import datastructure.generic.animal.Cat;
import datastructure.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1", 300);

        //개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
        Dog diggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("diggerDog = " + diggerDog);

    }
}
