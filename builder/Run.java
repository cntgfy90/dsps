package builder;

import builder.builders.HouseBuilder;
import builder.builders.ManualBuilder;
import builder.director.Director;
import builder.products.House;
import builder.products.Manual;

public class Run {
    public static void main(String args[]) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.buildConcreteHouse(houseBuilder);
        House house = houseBuilder.build();
        System.out.println("House built:\n" + house.getType());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.buildConcreteHouse(manualBuilder);
        Manual manual = manualBuilder.getManual();
        System.out.println(("Manual built for:\n" + manual.print()));
    }
}