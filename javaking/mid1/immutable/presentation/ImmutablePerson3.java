package javaking.mid1.immutable.presentation;

public final class ImmutablePerson3 {

    private final String name;
    private final RGB rgb;

    public ImmutablePerson3(String name, RGB rgb) {
        this.name = name;
        this.rgb = rgb;
    }

    public String getName() {
        return name;
    }

    public RGB getRgb() {
        return rgb;
    }
}
