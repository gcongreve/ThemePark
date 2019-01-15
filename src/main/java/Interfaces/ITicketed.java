package Interfaces;

import ThemePark.Visitor;

public interface ITicketed {

    public Double defaultPrice();

    public Double priceForVisitor(Visitor visitor);

}
