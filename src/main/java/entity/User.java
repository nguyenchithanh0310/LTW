package entity;

public class User {

    private String id;
    private String fullName;
    private String phoneNum;

    private String address;
    private String email;
    private String pass;
    private int admin;

    public User() {
    }

    public User(String id, String fullName, String phoneNum, String address, String email, String pass, int admin) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.address = address;
        this.email = email;
        this.pass = pass;
        this.admin = admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", admin=" + admin +
                '}';
    }
}
