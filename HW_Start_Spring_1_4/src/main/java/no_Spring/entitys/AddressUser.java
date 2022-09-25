package no_Spring.entitys;

public class AddressUser {
    private long id;
    private String zipcod;
    private String country;
    private String town;
    private String street;
    private String building;
    private String flat;

    public AddressUser() {
    }

    public AddressUser(long id, String zipcod, String country, String town, String street, String building, String flat) {
        this.id = id;
        this.zipcod = zipcod;
        this.country = country;
        this.town = town;
        this.street = street;
        this.building = building;
        this.flat = flat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZipcod() {
        return zipcod;
    }

    public void setZipcod(String zipcod) {
        this.zipcod = zipcod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
