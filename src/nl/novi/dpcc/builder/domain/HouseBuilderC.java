package nl.novi.dpcc.builder.domain;

public class HouseBuilderC {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;


    public HouseBuilderC(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderC withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderC withHousenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderC withHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderC withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderC withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderC withHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        House house = new House();
        if(this.streetName != null) {
            if (this.streetName.length() < 3) {
                throw new RuntimeException("Geen geldige straatnaam");
            }
            house.setStreetName(this.streetName);
        }
        // Een int is altijd 0 (nooit NULL), dus hier hoeft geen null check gedaan te worden.
        if(housenumber == 0) {
            throw new RuntimeException("Huisnummer mag niet 0 zijn!");
        }
        house.setHousenumber(housenumber);
        //Hetzelfde geldt voor boolean (let op: kleine letter). Deze kan geen null zijn. Default waarde is false.
        house.setHasGarden(this.hasGarden);

        if(this.houseNumberAddition != null) {
            house.setHouseNumberAddition(this.houseNumberAddition);
        }
        if(this.postalCode != null) {
            if (this.postalCode.length() < 6) {
                throw new RuntimeException("Geen geldige postcode");
            }
            house.setPostalCode(this.postalCode);
        }
        if(this.province != null) {
            house.setProvince(this.province);
        }
        return house;
    }


}
