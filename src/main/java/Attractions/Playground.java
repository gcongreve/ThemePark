package Attractions;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
       return  (visitor.getAge() > 15) ? false : true;
    }
}
