package api.stream.examples.models;

public class User {

    private Integer id;
    private String name;
    private String lastname;

    private static int lastId;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.id = ++lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        User.lastId = lastId;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }
}
