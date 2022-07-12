package org.classes;

import java.util.Map;

public class Noodles
{
    private int noodleId;
    private Map<String,Float> noodleDetails;

    // Getter Setter
    public int getNoodleId() {
        return noodleId;
    }

    public void setNoodleId(int noodleId) {
        this.noodleId = noodleId;
    }

    public Map<String, Float> getNoodleDetails() {
        return noodleDetails;
    }

    public void setNoodleDetails(Map<String, Float> noodleDetails) {
        this.noodleDetails = noodleDetails;
    }

    @Override
    public String toString() {
        return "Noodles{" +
                "noodleId=" + noodleId +
                ", noodleDetails=" + noodleDetails +
                '}';
    }
}
