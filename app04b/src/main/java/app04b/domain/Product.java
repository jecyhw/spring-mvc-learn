package app04b.domain;

import java.io.Serializable;

/**
 * Created by jecyhw on 2016/6/12.
 */
public class Product implements Serializable{
    private static final long serialVersionUID = 1234567890L;
    private String name;
    private String description;
    private float price;
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
