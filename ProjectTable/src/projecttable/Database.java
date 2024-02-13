/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Safwan
 */
public abstract class Database {
    
   public static int count(String coulmnName,String tableName){
       try {
            PreparedStatement statement = Database.conn().prepareStatement("SELECT MAX("+coulmnName+") FROM "+tableName+";");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int maxId = resultSet.getInt(1);
        //        System.out.println("أعلى رقم في الجدول هو: " + maxId);
                return maxId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
}
    
    public static Connection conn(){
                    
       // إنشاء متغيرات للاتصال والاستعلام
        Connection conn = null;       
//         معلومات الاتصال بقاعدة البيانات
        String url = "jdbc:mysql://localhost:3306/managetables?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "safwan";
        String password = "Safwan@123";
        
        try {
                // JDBC او برنامج تشغيل muSQLالخاص بي Driverلتعريف ;
             Class.forName("com.mysql.cj.jdbc.Driver");
             
            // إنشاء اتصال بقاعدة البيانات
            conn = DriverManager.getConnection(url,username,password);
//            System.out.println("تم الاتصال بقاعدة البيانات  بنجاح");
        } catch (ClassNotFoundException ex) {
            System.out.println("لم يتم العثور على برنامج التشغيل ");
            ex.printStackTrace(); //  لعرض المشكلة في حالة وجودها       
        } catch (SQLException ex) {
            System.out.println("فشل الاتصال بقاعدة البيانات");
           ex.printStackTrace(); //  لعرض المشكلة في حالة وجودها       
        }
        return conn;
    }
    
    
    public static void deleteRow(String tableName, String columnName, String value){
         try {
            // إعداد الاستعلام الذي يقوم بحذف الصف
            String query = "DELETE FROM " + tableName + " WHERE " + columnName + " = "+value;
            PreparedStatement statement = Database.conn().prepareStatement(query);

            // تعيين قيمة الحذف في الاستعلام
//            statement.setString(1, value);

            // تنفيذ الاستعلام لحذف الصف
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("تم حذف الصف بنجاح!");
            } else {
                System.out.println("لم يتم العثور على الصف المحدد!");
            }
        } catch (SQLException e) {
            System.out.println("فشل الاتصال بقاعدة البيانات أو حذف الصف!");
            e.printStackTrace();
        } finally {
            // إغلاق الاتصال بقاعدة البيانات
            try {
                if (Database.conn() != null) {
                    Database.conn().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}




public List display(){
    List list = new ArrayList<>();
    return list;
}

public abstract void delete(int deleteId);

public abstract void search(String searchName);

public abstract void search(int searchId);









    
    
 public static void displayTable(String tableName) {

        try {
            // إنشاء عبارة لاستعلام الجدول
            Statement statement = Database.conn().createStatement();

            // تنفيذ استعلام الجدول
            String query = "SELECT * FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(query);

            // عرض النتائج
            while (resultSet.next()) {
//                System.out.println("الصف: " + resultSet.getInt("row_number"));
                System.out.println("القيمة: " + resultSet.getString("column_name"));
                System.out.println("--------------------");
            }

            if (!resultSet.first()) {
                System.out.println("لا توجد بيانات في الجدول!");
            }
       } catch (SQLException e) {
            System.out.println("فشل الاتصال بقاعدة البيانات أو استعراض الجدول!");
            e.printStackTrace();
        } finally {
            // إغلاق الاتصال بقاعدة البيانات
            try {
                if (Database.conn() != null) {
                    Database.conn().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
}
