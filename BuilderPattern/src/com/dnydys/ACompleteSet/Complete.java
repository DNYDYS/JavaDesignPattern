package com.dnydys.ACompleteSet;

import com.dnydys.service.AudiItems;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Complete
 * @Description TODO
 * @Date 2021/12/26 11:50
 * @Created by hasee
 */
public class Complete {

    private List<AudiItems> items = new ArrayList<>();

    public void addItems(AudiItems item){
        items.add(item);
    }

    public float allPrice(){
        float cost = 0.0f;
        for (AudiItems item: items){
            cost = cost + item.price();
        }
        return cost;
    }

    public void showAudiItems(){
        for (AudiItems item: items){
            System.out.println(item.name());
            System.out.println(item.assembling().assembling());
            System.out.println(item.price());
        }
    }

}
