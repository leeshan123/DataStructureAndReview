package datastructure.generic.ex3;

import datastructure.generic.animal.Cat;
import datastructure.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1", 300);

        //개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음.

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
//        dogHospital.set(cat);
        Dog diggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); //강제적인 다운캐스팅
        System.out.println("diggerDog = " + diggerDog);

    }
}
