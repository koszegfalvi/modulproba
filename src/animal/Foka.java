package animal;

import java.util.ArrayList;
import java.util.List;

public class Foka extends Animal{
    public String name;
    public int fokaQuantity = 0;

    public Foka(String name) {
        this.name = name;
        fokaQuantity++;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<String> namesOfFoka = new ArrayList<>();

    public void addNickname(String nickName) {

        namesOfFoka.add(nickName);
    }

    public void lekerdezes(String name) {
        for (int i = 0; i < namesOfFoka.size(); i++) {

        }
        if (name.equals(namesOfFoka.get(0))) {
            System.out.println(namesOfFoka);

        }
    }


}
