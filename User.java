public class User {
    private String userName;
    private String password;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String idNumber, String password, String phoneNumber, String userName) {
        this.idNumber = idNumber;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   

}
