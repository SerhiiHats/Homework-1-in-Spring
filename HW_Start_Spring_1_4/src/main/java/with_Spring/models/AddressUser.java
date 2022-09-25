package with_Spring.models;

public interface AddressUser {
    long getId();

    void setId(long id);

    String getZipcod();

    void setZipcod(String zipcod);

    String getCountry();

    void setCountry(String country);

    String getTown();

    void setTown(String town);

    String getStreet();

    void setStreet(String street);

    String getBuilding();

    void setBuilding(String building);

    String getFlat();

    void setFlat(String flat);
}
