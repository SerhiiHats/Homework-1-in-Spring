package with_Spring.models.impl;

import with_Spring.models.WifeUser;

public class WifeImpl implements WifeUser {
    private long id;
    private String name;

    public WifeImpl() {
    }

    public WifeImpl(long id, String name) {
        this.id = id;
        this.name = name;
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
}
