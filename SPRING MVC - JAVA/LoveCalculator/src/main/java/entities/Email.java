package entities;

public class Email {

    private String useremail;

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "useremail='" + useremail + '\'' +
                '}';
    }
}
