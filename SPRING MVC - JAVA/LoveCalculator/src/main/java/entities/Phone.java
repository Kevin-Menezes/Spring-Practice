package entities;

public class Phone {

    public String countrycode;
    public String usernumber;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    @Override
    public String toString() {
        return getCountrycode()+"-"+getUsernumber();
    }
}
