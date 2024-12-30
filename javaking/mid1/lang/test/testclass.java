package javaking.mid1.lang.test;

import java.util.Objects;

public class testclass {

    Integer x;

    public testclass(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        testclass testclass = (testclass) o;
        return Objects.equals(x, testclass.x);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x);
    }
}
