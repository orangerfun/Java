import java.io.*;
import java.util.List;

public class Book {
    private int no;
    private String name;
    private double price;

    public Book(int no, String name, double price){
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "编号："+this.no+"\t名称："+this.name+"\t价格："+this.price;
    }

    // 将图书信息从list中取出存入文件
    public static void write(List books){
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:/Desktop/TEMP/Java/SaveBook/src/books.txt");
            for(int i=0; i<books.size(); i++){
                fw.write(books.get(i).toString()+"\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //读取文件内容
    public static void read(){
        FileReader fr = null;
        BufferedReader br =null;
        try {
            fr = new FileReader("D:/Desktop/TEMP/Java/SaveBook/src/books.txt");
            br = new BufferedReader(fr);
            String str = "";
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
