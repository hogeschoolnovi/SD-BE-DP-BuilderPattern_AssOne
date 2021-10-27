package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.House;
import nl.novi.dpcc.builder.domain.HouseBuilder;
import nl.novi.dpcc.builder.domain.HouseBuilderB;
import nl.novi.dpcc.builder.domain.HouseBuilderC;

public class Main {

    public static void main(String[] args) {

        // Opdracht A
	    House house = new HouseBuilder()
                .withStreetName("Straatweg")
                .withHousenumber(12)
                .withHouseNumberAddition("")
                .withHasGarden(false)
                .withProvince("Utrecht")
                .withPostalCode("1234AB").build();

        House holidayHouse = new HouseBuilderB("WegStraat",
                1, "", "1212AA").build();

        // Deze gooit errors!
        House fakeHouse = new HouseBuilderC("", 0, "", "").build();
    }
}
