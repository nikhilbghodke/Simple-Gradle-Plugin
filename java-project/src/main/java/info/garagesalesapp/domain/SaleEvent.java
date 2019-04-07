package info.garagesalesapp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by jamesharmon on 5/1/17.
 */
public class SaleEvent {

    private String id;
    private String streetAddress;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SaleEvent: " +
                id +
                ", " + streetAddress +
                ", " + city;
    }

    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setId("100");
        saleEvent.setStreetAddress("123 Main St.");
        saleEvent.setCity("Naperville");

        System.out.println(saleEvent.toString());

        JsonDisplay.showJson(saleEvent);

    }
}
