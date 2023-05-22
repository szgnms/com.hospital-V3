package hospital.repo;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String disease;

    private int room;

    public Patient(){}

    public Patient(int id, String name, String surname, String disease, int room) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.disease = disease;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        " name=" + name +
                        " surname=" + surname +
                        " disease=" + disease +
                        " room=" + room;

    }
}
