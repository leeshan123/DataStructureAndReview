package javaking.mid1.lang.immutable.presentation;

public final class ImmutablePerson4 {

    private final String name;
    private final RGB rgb;

    public ImmutablePerson4(String name, RGB rgb) {
        this.name = name;
        this.rgb = new RGB(rgb.r,rgb.g,rgb.b);
    }

    public String getName() {
        return name;
    }

    public RGB getRgb() {
        return rgb;
    }
}
