package animal;

import java.util.ArrayList;
import java.util.List;

public class Elephant extends Animal {
    public String name;
    public int elephantquantity = 0;

    public Elephant(String name) {
        this.name = name;
        elephantquantity++;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    List<String> namesOfElephant = new ArrayList<>();


    public void addNickname(String nickName) {

        namesOfElephant.add(nickName);
    }

    public void lekerdezes(String name) {
        for (int i = 0; i < namesOfElephant.size(); i++) {

        }
        if (name.equals(namesOfElephant.get(0))) {
            System.out.println(namesOfElephant);

        }
    }


}

