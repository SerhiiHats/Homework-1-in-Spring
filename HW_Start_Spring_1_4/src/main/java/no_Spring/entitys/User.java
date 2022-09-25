package no_Spring.entitys;

public class User {
    private long id;
    private String name;
    private AddressUser address;
    private WifeUser wife;
    private ChildUser child;

    public User() {
    }

    public User(long id, String name, AddressUser address, WifeUser wife, ChildUser child) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.wife = wife;
        this.child = child;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressUser getAddress() {
        return address;
    }

    public void setAddress(AddressUser address) {
        this.address = address;
    }

    public WifeUser getWife() {
        return wife;
    }

    public void setWife(WifeUser wife) {
        this.wife = wife;
    }

    public ChildUser getChild() {
        return child;
    }

    public void setChild(ChildUser child) {
        this.child = child;
    }
}
