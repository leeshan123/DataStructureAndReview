package javaking.ad2.io.member.impl;

import javaking.ad2.io.member.Member;
import javaking.ad2.io.member.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMemberRepository implements MemberRepository {

    private static final String FILE_PATH = "temp/members-data.dat";

    @Override
    public void add(Member member) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH,true))){
            dos.writeUTF(member.getId());
            dos.writeUTF(member.getName());
            dos.writeInt(member.getAge());

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        ArrayList<Member> members = new ArrayList<>();
        try(DataInputStream dis = new DataInputStream(new FileInputStream(FILE_PATH))){
            while (dis.available() > 0){
                members.add(new Member(dis.readUTF(), dis.readUTF(), dis.readInt()));
            }
            return members;
        }catch (FileNotFoundException e){
            return List.of();
        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
