package entities;

public class Student {
    private String name;
    private String email;
    private int room;

    public Student(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public int getRoom(){
        return this.room;
    }

    public void setRoom(int newRoom){
        this.room = newRoom;
    }
    
    public String toString(){
        return this.getRoom() + ": " + this.getName() + ", " + this.getEmail();
    }

}
