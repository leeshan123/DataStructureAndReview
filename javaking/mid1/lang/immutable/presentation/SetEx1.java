package javaking.mid1.lang.immutable.presentation;

import java.util.HashSet;
import java.util.Set;

class ImmutableKey{
    private String key;

    public ImmutableKey(String key) {
        this.key = key;
    }

    public ImmutableKey changeKey(String newKey){
        return new ImmutableKey(newKey);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ImmutableKey that = (ImmutableKey) obj;
        return key.equals(that.key);
    }
}
public class SetEx1 {
    public static void main(String[] args) {

        Set<ImmutableKey> set = new HashSet<>();

        ImmutableKey key = new ImmutableKey("original");
        set.add(key);

        System.out.println("바꾸기 전 : " + set.contains(key));

        ImmutableKey newKey = key.changeKey("changed"); //key 변경 -> MutableKey의 멤버 변수 변경

        System.out.println("바꾼 후  : (key)" + set.contains(key));
        System.out.println("바꾼 후  : (newKey)" + set.contains(newKey));

        set.add(newKey);
        for (ImmutableKey k : set) {
            if (k.equals(newKey)) {
                System.out.println("Set에서 찾은 새로운 키 객체: " + k);
            }
            if(k.equals(key)){
                System.out.println("oldkey: "+ k);
            }
        }


    }



}
