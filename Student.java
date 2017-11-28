package studentmessage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Student  {
    public static void main(String []args) throws IOException {
        tools tool=new tools();
        ArrayList collagelist = tool.getCollageList();
        System.out.println(collagelist);//输出学院

        System.out.println("请选择你想查询的学院：");
        Scanner scan1 =new Scanner(System.in );//输入要查询的学院的专业
        String collage=scan1.next();
        Map collagetomajor = tool.getCollageToMajorMap();
        List majorList = (List) collagetomajor.get(collage);
        System.out.println(majorList);//输出所对应的专业
        System.out.println("请输入你想查询的专业：");
        Scanner scan2=new Scanner(System.in);//输入你想查询的班级
        String major=scan2.next();
        Map majortoclass=tool.getMajorToClassList();
        ArrayList majory= (ArrayList) majortoclass.get(major);
        System.out.println(majory);//输出你想查询的班级

        System.out.println("请输入你想查询的班级");
        Scanner scan3=new Scanner(System.in);//输入你想查询的班级
        String  classy=scan3.next();
        Map students=tool.getClassList(classy);
        System.out.println(students);//输出你想查询的班级

        System.out.println("请输入你想查询的同学");
        Scanner scan4=new Scanner(System.in);
        String studentName=scan4.next();
        ArrayList studentMessage= (ArrayList) students.get(studentName);
        System.out.println(studentMessage);

        //输入学生学号查询学生信息



    }
}
