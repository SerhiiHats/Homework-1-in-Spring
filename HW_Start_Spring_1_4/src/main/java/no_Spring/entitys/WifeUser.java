package no_Spring.entitys;

public class WifeUser {
    private long id;
    private String name;

    public WifeUser() {
    }

    public WifeUser(long id, String name) {
        this.id = id;
        this.name = name;
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
}
