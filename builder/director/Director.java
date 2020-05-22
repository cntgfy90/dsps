package builder.director;

import builder.builders.Builder;
import builder.products.Types;

public class Director {

    public void buildWoodenHouse(Builder builder) {
        builder.setType(Types.WOODEN);
        builder.setBase("wood");
        builder.setLevels(2);
        builder.setRoof("wooden");
    }

    public void buildConcreteHouse(Builder builder) {
        builder.setType(Types.CONCRETE);
        builder.setBase("concrete");
        builder.setLevels(10);
        builder.setRoof("concrete");
    }

}