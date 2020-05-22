package builder.builders;

import builder.products.Manual;
import builder.products.Types;

public class ManualBuilder implements Builder {
    private Types type;
    private String base;
    private int levels;
    private String roof;

    @Override
    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }
    
    public Manual getManual() {
        return new Manual(this.type, this.base, this.levels, this.roof);
    }
}