import javax.jnlp.FileOpenService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteRead {
    public static void main(String[] args){

        //文件输入流:读取文件
       /* File f = new File("D:/Desktop/TEMP/java/文件/src/test.txt");
        try{
            FileInputStream fis = new FileInputStream(f);
            byte[] bytes = new byte[1024];   //定义一个长1024的数组
            int n = 0;
            System.out.println("文件内容如下：");
            while((n=fis.read(bytes)) != -1 ){     //每次读取1024字节；返回读取字节数
                String s = new String(bytes, 0, n,"utf-8");   //取字节数组中0~n的字节去组成string
                System.out.println(s);
            }
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/


       //文件输出流（写入文件）:读取文件内容，并写入一个新的文件当中；
        try{
            File srcFile = new File("D:/Desktop/TEMP/java/文件/src/test.txt");
            File tarFile = new File("D:/Desktop/TEMP/java/文件/src/tar.txt");
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(tarFile);
            byte[] bytes = new byte[1024];
            int i = fis.read(bytes);
            while(i!=-1){
                fos.write(bytes,0,i);
                i = fis.read(bytes);
            }
            System.out.println("写入结束");
            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
