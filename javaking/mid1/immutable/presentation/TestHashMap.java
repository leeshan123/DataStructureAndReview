package javaking.mid1.immutable.presentation;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Objects;

class MutableMember {
    private String name;
    private int age;

    private MutableMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static MutableMember withNameAndAge(String name, int age) {

        return new MutableMember(name, age);
    }

    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MutableMember that = (MutableMember)o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class TestHashMap {

    public static void main(String[] args) {
        TestHashMap test = new TestHashMap();
        test.checkHashMapByMutableMember();
    }

    private void checkHashMapByMutableMember() {
        HashMap<MutableMember, Integer> map = new HashMap<>();
        MutableMember memberA = MutableMember.withNameAndAge("memberA", 20);
        map.put(memberA, 10);

        // before change Name: map.get(memberA) = true
        System.out.println("before change Name: map.get(memberA) = " + map.get(memberA));


        memberA.changeName("memberAA");

        // after change name: map.get(memberA) = null
        System.out.println("after change name: map.get(memberA) = " + map.get(memberA));


    }

}
