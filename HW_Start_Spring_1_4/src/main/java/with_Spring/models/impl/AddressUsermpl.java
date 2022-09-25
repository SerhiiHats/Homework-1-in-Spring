package with_Spring.models.impl;

import with_Spring.models.AddressUser;

public class AddressUsermpl implements AddressUser {
    private long id;
    private String zipcod;
    private String country;
    private String town;
    private String street;
    private String building;
    private String flat;

    public AddressUsermpl() {
    }

    public AddressUsermpl(long id, String zipcod, String country, String town, String street, String building, String flat) {
        this.id = id;
        this.zipcod = zipcod;
        this.country = country;
        this.town = town;
        this.street = street;
        this.building = building;
        this.flat = flat;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getZipcod() {
        return zipcod;
    }

    @Override
    public void setZipcod(String zipcod) {
        this.zipcod = zipcod;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String getFlat() {
        return flat;
    }

    @Override
    public void setFlat(String flat) {
        this.flat = flat;
    }
}
