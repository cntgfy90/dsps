package builder.builders;

import builder.products.Types;

public interface Builder {
    void setType(Types type);
    void setBase(String base);
    void setLevels(int levels);
    void setRoof(String roof);
}