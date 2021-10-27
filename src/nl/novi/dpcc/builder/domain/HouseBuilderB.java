package nl.novi.dpcc.builder.domain;

public class HouseBuilderB {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;


    public HouseBuilderB(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderB withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderB withHousenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderB withHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderB withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderB withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderB withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        House house = new House();
        if(this.streetName != null) {
            house.setStreetName(this.streetName);
        }
        // Een int is altijd 0 (nooit NULL), dus hier hoeft geen null check gedaan te worden.
        house.setHousenumber(housenumber);
        //Hetzelfde geldt voor boolean (let op: kleine letter). Deze kan geen null zijn. Default waarde is false.
        house.setHasGarden(this.hasGarden);

        if(this.houseNumberAddition != null) {
            house.setHouseNumberAddition(this.houseNumberAddition);
        }
        if(this.postalCode != null) {
            house.setPostalCode(this.postalCode);
        }
        if(this.province != null) {
            house.setProvince(this.province);
        }
        return house;
    }


}
