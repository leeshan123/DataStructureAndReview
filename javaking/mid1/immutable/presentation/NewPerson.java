package javaking.mid1.immutable.presentation;

public class NewPerson extends ImmutablePerson1{

    private String newName;
    public NewPerson(String name) {
        super(name);
        newName = name;
    }

    public void setName(String name){
        this.newName = name;
    }
    public String getName(){
        return this.newName;
    }
}
