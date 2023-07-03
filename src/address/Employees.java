package address;

import java.util.HashMap;
import java.util.Map;

public class Employees extends Address{

  public String employeesName;



    Map<Employees, Address> employeesData  = new HashMap<>();

public void addAddress(String employeesName){
if(employeesData.containsKey(employeesName)){
    employeesData.put(employeesName,new Address());


    }

}
public void changeAddress(String employeesName){
    if(employeesData.containsKey(employeesName)){
        employeesData.replace(employeesName,new Address(countryName, postCode,streetName,
                houseNumber, floorNumber, doorNumber));
    }
}
}
