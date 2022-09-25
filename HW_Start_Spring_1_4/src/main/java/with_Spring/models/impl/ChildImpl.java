package with_Spring.models.impl;

import with_Spring.models.ChildUser;

public class ChildImpl implements ChildUser {
    private long id;
    private String name;

    public ChildImpl() {
    }

    public ChildImpl(long id, String name) {
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
