package with_Spring.models;

public interface User {

    long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    AddressUser getAddress();

    void setAddress(AddressUser address);

    WifeUser getWife();

    void setWife(WifeUser wife);

    ChildUser getChild();

    void setChild(ChildUser child);

}

