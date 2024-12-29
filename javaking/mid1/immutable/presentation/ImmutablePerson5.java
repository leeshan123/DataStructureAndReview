package javaking.mid1.immutable.presentation;

public final class ImmutablePerson5 {

    private final String name;
    private final RGB rgb;

    public ImmutablePerson5(String name, RGB rgb) {
        this.name = name;
        this.rgb = new RGB(rgb.r,rgb.g,rgb.b);
    }

    public String getName() {
        return name;
    }

    public RGB getRgb() {
        return new RGB(rgb.r, rgb.g, rgb.b);
    }
}
