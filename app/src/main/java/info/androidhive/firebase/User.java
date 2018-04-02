package info.androidhive.firebase;

/**
 * Created by justin junias on 21/03/2018.
 */

public class User {
    private String name;
    private String email;
    private String status;
    private String password;
    public User(){

    }
    public User (String name,String status,String password){
        this.name = name;
        this.status = status;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
