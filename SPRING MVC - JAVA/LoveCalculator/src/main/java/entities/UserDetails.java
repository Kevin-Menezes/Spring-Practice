package entities;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDetails {

    @NotBlank(message = "{name.notBlank}") // Check in the message.properties file
    @Size(min = 3,max = 20,message = "Enter more than 3 and less than 20 characters")
    private String username;

    @NotBlank(message = "Crushname should not be blank")
    @Size(min = 3,max = 20,message = "Enter more than 3 and less than 20 characters")
    private String crushname;

    @AssertTrue(message = "You have to agree to our terms and conditions!")
    private boolean termsCondition;

    private String answer;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCrushname() {
        return crushname;
    }

    public void setCrushname(String crushname) {
        this.crushname = crushname;
    }

    public boolean isTermsCondition() {
        return termsCondition;
    }

    public void setTermsCondition(boolean termsCondition) {
        this.termsCondition = termsCondition;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "username='" + username + '\'' +
                ", crushname='" + crushname + '\'' +
                ", termsCondition=" + termsCondition +
                ", answer='" + answer + '\'' +
                '}';
    }
}
