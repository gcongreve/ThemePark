package Interfaces;

import ThemePark.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
