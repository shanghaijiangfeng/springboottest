//package com.example.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class JdbcApp {
//
//    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        //连接
//        String url = "jdbc:mysql://47.106.105.248:3306/shuaifeng?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        String username = "root";
//        String password = "root";
//
//        //获取连接对象，并连接数据库
//        Connection connection = DriverManager.getConnection(url,username,password);
//
//
//        //获取语句对象
//        Statement statement = connection.createStatement();
//
//        ResultSet resultSet =  statement.executeQuery("select * from video");
//
//        while (resultSet.next()){
//
//            System.out.println("视频标题:"+resultSet.getString("title"));
//
//        }
//        statement.close();
//    }
//}
