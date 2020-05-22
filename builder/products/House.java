package builder.products;

public class House {
    private Types type;
    private String base;
    private int levels;
    private String roof;

    public House(
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

   public Types getType() {
        return this.type;
    }

    public String getBase() {
        return this.base;
    }

    public int getLevels() {
        return this.levels;
    }

    public String getRoof() {
        return this.roof;
    }
}