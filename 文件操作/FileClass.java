import java.io.File;
import java.io.FilenameFilter;

//创建文件过滤器
class ImageFilter implements FilenameFilter
{
    public boolean accept(File dir, String name)
    {
        return name.endsWith(".pdf")||name.endsWith(".docx");
    }
}

public class FileClass {
    public static void main(String[] args){
        String path1 = "D:/Desktop/TEMP/java/文件/src/test.txt";
        String path2 = "D:/Desktop/TEMP/";
//        File f1 = new File(path1);
//        File f2 = new File(path2);
//        //打印文件长度，单位：字节
//        System.out.println(f1.length());
//        //判断是不是目录
//        System.out.println(f1.isDirectory()+"\t"+f2.isDirectory());
//        //文件名称: 不管是目录还是文件，返回最后一层的名字
//        System.out.println(f1.getName()+"\t"+f2.getName());
//        //判断是否存在该文件
//        System.out.println(f1.exists()+"\t"+f2.exists());

        //遍历TEMP目录下的所有文件和目录，并显示文件或目录名称、类型及大小
        File f = new File(path2);
        String[] FileList = f.list(new ImageFilter());
        for(int i=0; i<FileList.length; i++){
            System.out.println(FileList[i]);
        }
    }
}
