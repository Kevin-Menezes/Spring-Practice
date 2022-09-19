package entities;

public class CreditCard {

    private Integer firstfourdigits;
    private Integer secondfourdigits;
    private Integer thirdfourdigits;
    private Integer lastfourdigits;

    public Integer getFirstfourdigits() {
        return firstfourdigits;
    }

    public void setFirstfourdigits(Integer firstfourdigits) {
        this.firstfourdigits = firstfourdigits;
    }

    public Integer getSecondfourdigits() {
        return secondfourdigits;
    }

    public void setSecondfourdigits(Integer secondfourdigits) {
        this.secondfourdigits = secondfourdigits;
    }

    public Integer getThirdfourdigits() {
        return thirdfourdigits;
    }

    public void setThirdfourdigits(Integer thirdfourdigits) {
        this.thirdfourdigits = thirdfourdigits;
    }

    public Integer getLastfourdigits() {
        return lastfourdigits;
    }

    public void setLastfourdigits(Integer lastfourdigits) {
        this.lastfourdigits = lastfourdigits;
    }

    @Override
    public String toString() {
        return ""  + firstfourdigits +
                "-" + secondfourdigits +
                "-" + thirdfourdigits +
                "-" + lastfourdigits +"";
    }
}
