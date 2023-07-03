package animal;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Animal{
    public String name;
    int lionQuantity = 0;

    public Lion(String name) {
        this.name = name;
        lionQuantity++;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<String> namesOfLion = new ArrayList<>();

    public void addNickname(String nickName) {

        namesOfLion.add(nickName);
    }

    public void lekerdezes(String name) {
        for (int i = 0; i < namesOfLion.size(); i++) {

        }
        if (name.equals(namesOfLion.get(0))) {
            System.out.println(namesOfLion);

        }
    }


}
