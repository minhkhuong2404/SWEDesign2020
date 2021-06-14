package com.company;

public abstract class Options implements Price{
    protected Price optionsPrice;
    public Options(Price price){
        optionsPrice = price;
    }
    public Price getOptionsPrice(){
        return optionsPrice;
    }
    public void setOptionsPrice(){
        this.optionsPrice = optionsPrice;
    }


}
