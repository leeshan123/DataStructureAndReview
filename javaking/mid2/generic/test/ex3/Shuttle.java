package javaking.mid2.generic.test.ex3;

import javaking.mid2.generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T bioUnit;

    public void in(T bioUnit){this.bioUnit = bioUnit;}

    public void showInfo(){
        System.out.println("이름: " +bioUnit.getName()+", HP: "+bioUnit.getHp());
    }

    public T out() {
        return bioUnit;
    }

}
