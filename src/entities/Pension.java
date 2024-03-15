package entities;
public class Pension {

    private String name;
    private String email;
    private int room;

    public Pension(){
    }

    public Pension(int room, String name, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }

    public String getName() { // reading
        return name;
    }

    public void setName(String name) { // modification
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    public String toString() {
        return room + ": " + name + ", " + email;
    }
}
