package app05a.domain;

/**
 * Created by jecyhw on 2016/6/12.
 */
public class Category {
    private static final long serialVersionUID = 1223343434L;
    private int id;
    private String name;

    public Category() {

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
