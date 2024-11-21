package model;

public abstract class User {
    private int id;
    private String username;
    private String fullName;
    private String password;

    public User(int id, String username, String fullName, String password) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.password = password;
    }

    public int getIdUser() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public abstract void navigateToMenu();
}
