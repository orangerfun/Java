//定义category类，设置图书所属类别

public class Category {
    private int id;
    private String name;

    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "所属分类"+this.name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }
}
