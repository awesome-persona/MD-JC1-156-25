package lesson16;

import java.io.Serializable;

// v1
// v2
// v3


public class Contact implements Serializable {

    public static final long serialVersionUID = 1L;
    public static long test = 1L;

    private String username;
    private String email;
    private transient String password;
    private transient Integer oneTimePassword;
    private Integer phone;
    private Boolean isMale;

    public Contact() {
    }

    public Contact(String username, String email, String password, Integer phone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public Contact(String username, String email, String password, Integer phone, Boolean isMale) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.isMale = isMale;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", isMale=" + isMale +
                '}';
    }
}
