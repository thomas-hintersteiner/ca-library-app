import java.util.Date;

public class Author {
    private String name;
    private String email;
    private Date birthdate;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.birthdate = null;
    }

    public Author(String name, String email, Date birthdate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getInfo() {
        return this.name + " (" + this.email + ")";
    }
}
