package builder.products;

public class Manual {
    private Types type;
    private String base;
    private int levels;
    private String roof;

    public Manual(
        Types type,
        String base,
        int levels,
        String roof
    ) {
        this.type = type;
        this.base = base;
        this.levels = levels;
        this.roof = roof;
    }

    public String print() {
        return this.base + this.type + this.levels + this.roof;
    }

}