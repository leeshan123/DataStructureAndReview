package javaking.mid1.lang.immutable.presentation;

import java.util.HashMap;
import java.util.Objects;

final class ImmutableMember {
    private final String name;
    private final int age;

    private ImmutableMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ImmutableMember withNameAndAge(String name, int age) {
        return new ImmutableMember(name, age);
    }

    public ImmutableMember changeName(String name) {
        return new ImmutableMember(name, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ImmutableMember that = (ImmutableMember)o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class TestHashMap2 {

    public static void main(String[] args) {
        TestHashMap2 test = new TestHashMap2();
        test.checkHashMapByImmutableMember();
    }

    private void checkHashMapByImmutableMember() {
        HashMap<ImmutableMember, Integer> map = new HashMap<>();
        ImmutableMember memberA = ImmutableMember.withNameAndAge("memberA", 20);
        map.put(memberA, 10);

        // before change Name: map.get(memberA) = true
        System.out.println("before change Name: map.get(memberA) = " + map.get(memberA));

        ImmutableMember memberAA = memberA.changeName("memberAA");

        // after change name: map.get(memberA) = true
        System.out.println("after change name: map.get(memberA) = " + map.get(memberA));

    }
}