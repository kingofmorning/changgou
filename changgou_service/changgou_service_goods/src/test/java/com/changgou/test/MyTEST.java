package com.changgou.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class MyTEST {

    public static void main(String[] args) {

        String jsonStuList = JSON.toJSONString(getList());

        List<StudentInfo> studentInfos = JSON.parseArray(jsonStuList, StudentInfo.class);

        for (StudentInfo studentInfo : studentInfos) {
            System.out.println(studentInfo);
        }


    }


    public static List<Student> getList(){
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("1","119","zhangsan",21));
        list.add(new Student("2","120","zhangda",22));
        list.add(new Student("3","121","zhangxiao",24));

        return list;
    }




}
