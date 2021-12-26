package com.dnydys.ACompleteSet;

import com.dnydys.MakeCars.AudiA7;
import com.dnydys.MakeCars.AudiRS7;
import com.dnydys.MakeParts.Cgw;
import com.dnydys.MakeParts.EA777;

/**
 * @Classname CompleteBuilder
 * @Description TODO
 * @Date 2021/12/26 12:16
 * @Created by hasee
 */
public class CompleteBuilder {

    public Complete prepareA7(){
        Complete complete = new Complete();
        complete.addItems(new AudiA7());
        complete.addItems(new Cgw());
        return complete;
    }
    public Complete prepareRS7(){
        Complete complete = new Complete();
        complete.addItems(new AudiRS7());
        complete.addItems(new EA777());
        return complete;
    }

}
