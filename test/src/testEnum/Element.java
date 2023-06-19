package testEnum;

public enum Element {
    H("Bonjour", "Hola"),
    HE("Helium", "test2"),
    NE("Neon", "test");

    private final String labelFr;
    private final String labelEs;

    private Element(String labelFr, String labelEs) {
        this.labelFr = labelFr;
        this.labelEs = labelEs;
    }

    public final String getLabelFr() {
        return labelFr;

    }

    public final String getLabelEs() {
        return labelEs;
    }

    public final String getLabel() {
        return Context.tenant.equals("fr") ? labelFr : labelEs;

    }
}

