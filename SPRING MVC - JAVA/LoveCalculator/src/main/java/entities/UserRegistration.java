package entities;

import Validators.Age;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;

public class UserRegistration {

    @NotEmpty(message = "Name should not be empty")
    private String name;

    private String username;
    @NotEmpty(message = "Password should not be empty")
    private char[] password;
    @NotEmpty(message = "Country should not be empty")
    private String countryname;
    @Age(lower=18,upper=60)
    private Integer age;
    @NotEmpty(message = "Hobbies should not be empty")
    private String[] hobbies;
    @NotEmpty(message = "Gender should not be empty")
    private String gender;

    private UserCommunication usercommunication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserCommunication getUsercommunication() {
        return usercommunication;
    }

    public void setUsercommunication(UserCommunication usercommunication) {
        this.usercommunication = usercommunication;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password=" + Arrays.toString(password) +
                ", countryname='" + countryname + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", gender='" + gender + '\'' +
                ", usercommunication=" + usercommunication +
                '}';
    }
}
