package entities;

import javax.validation.constraints.Pattern;

public class UserCommunication {

    private String email;
    private Phone phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserCommunication{" +
                "email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
