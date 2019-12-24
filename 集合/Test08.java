/*本次有 5 名学生参加考试，当老师录入每名学生的成绩后，程序将按照从低到高的排列顺序显示学生成绩。
此外，老师可以查询本次考试是否有满分的学生存在，不及格的成绩有哪些，90 分以上成绩的学生有几名
 */

import java.util.TreeSet;
import  java.util.*;

public class Test08 {
    public static void main(String[] args){
        TreeSet scores = new TreeSet();  //创建TreeSet集合
        Scanner input = new Scanner(System.in);
        System.out.println("*********学生管理成绩管理系统**********");
        for(int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"个学生成绩");
            double score = input.nextDouble();
            scores.add(score);
        }
        Iterator it = scores.iterator();
        System.out.println("学生成绩从低到高的排序为：");
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }

        //查询成绩
        System.out.println("\n请输入要查询的成绩");
        double searchScore = input.nextDouble();
        if (scores.contains(searchScore)){
            System.out.println("该成绩存在");
        }
        else{
            System.out.println("该成绩不存在");
        }

        //列出不及格的学生成绩
        SortedSet score1 = scores.headSet(60.0);
        System.out.println("不及格的成绩有：");
        for(Object x:score1)
        {
            System.out.print(x+"\t");
        }

        //列出80分以上的成绩
        SortedSet score2 = scores.tailSet(80.0);
        System.out.println("\n80以上的成绩有：");
        for(int i=0; i<score2.size(); i++){
            System.out.print(score2.toArray()[i]+"\t");
        }

    }
}