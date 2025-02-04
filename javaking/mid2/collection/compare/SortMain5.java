package javaking.mid2.collection.compare;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(myUser1);
        treeSet.add(myUser2);
        treeSet.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdIterator 정렬");
        System.out.println(treeSet2);


    }

}
