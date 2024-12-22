package javaking.basic.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId","kim");
        member.print();
        member.changeData("myid2","seo");
        member.print();
        member.changeData2("lee");
        member.print();

    }

}
