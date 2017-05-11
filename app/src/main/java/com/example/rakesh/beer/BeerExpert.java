package com.example.rakesh.beer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rakesh on 05-02-2017.
 */

public class BeerExpert {
    List<String> getBeer(String color){
        List<String> brands=new ArrayList<>();
        if (color.equals("Yellow")){
            brands.add("Kingfisher Ultra");
            brands.add("Fosters");
        }else if (color.equals("Light")){
            brands.add("Tuborg");
            brands.add("Heinkin");
        }else{
            brands.add("Kingfisher Strong");
            brands.add("Haywards 5000");
        }
        return brands;
    }
}
