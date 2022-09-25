package with_Spring.models.impl;


import with_Spring.models.AddressUser;
import with_Spring.models.ChildUser;
import with_Spring.models.User;
import with_Spring.models.WifeUser;

public class UserImpl implements User {
    private long id;
    private String name;
    private AddressUser address;
    private WifeUser wife;
    private ChildUser child;

    public UserImpl() {
    }

    public UserImpl(long id, String name, AddressUser address, WifeUser wife, ChildUser child) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.wife = wife;
        this.child = child;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AddressUser getAddress() {
        return address;
    }

    @Override
    public void setAddress(AddressUser address) {
        this.address = address;
    }

    @Override
    public WifeUser getWife() {
        return wife;
    }

    @Override
    public void setWife(WifeUser wife) {
        this.wife = wife;
    }

    @Override
    public ChildUser getChild() {
        return child;
    }

    @Override
    public void setChild(ChildUser child) {
        this.child = child;
    }
}
