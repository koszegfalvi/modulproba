package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {

    List<String> szovegek = new ArrayList<>(Arrays.asList(
            "Ez egy rövid szöveg.",
            "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
            "Ez is egy rövid szöveg.",
            "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
    ));

    public String stringModifier(ArrayList szovegek) {
        List<String> modifiedText = new ArrayList<>();
        for (int i = 0; i < szovegek.size(); i++) {
            if (szovegek.get(i).toString().length() > 25) {
                modifiedText.add(szovegek.get(i).toString().substring(21).concat("..."));

            } else {
                modifiedText.add(szovegek.get(i).toString());
            }

        }

        return stringModifier(szovegek);

    }


}
