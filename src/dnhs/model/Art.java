package dnhs.model;

public abstract class Art extends Object{
    public String name;
    public String type;
    public String price;
    public String description;

    public Art(String type, String price, String name, String description){
        this.type = type;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Art(String type, String price, String name){
        this.type = type;
        this.price = price;
        this.name = name;
    }

}

