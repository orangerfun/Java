//设置BookInfo类，定义图书信息包括编号，名字， 价格等；

public class BookInfo {
    public int id;
    public String name;
    public double price;
    public String author;
    public String startTime;

    public BookInfo(int id, String name, double price, String author, String startTime){
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.startTime = startTime;
    }

    public String toString(){
        return this.id+"\t\t"+this.name+"\t\t"+this.price+"\t\t"+this.author+"\t\t"+this.startTime;
    }

    //todo: setId, getId,setName,getName...

}
