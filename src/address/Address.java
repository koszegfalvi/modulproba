package address;

import java.util.ArrayList;
import java.util.List;

public class Address {
public String countryName;
 public String postCode;
 public String streetName;
 public String houseNumber;
 public String floorNumber;
  public String doorNumber;

    List<Address> addressOfEmployee = new ArrayList<>();


    public Address(String countryName, String postCode, String streetName,
                   String houseNumber, String floorNumber, String doorNumber) {
        this.countryName = countryName;
        this.postCode = postCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.doorNumber = doorNumber;
    }

    public Address() {

    }

    public String getCountryName() {
        return countryName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }
}




