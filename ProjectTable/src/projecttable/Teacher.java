/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Safwan
 */

public class Teacher extends Database{
    private int teacherId;
    private String teacherName;
    private String teacherEmail;
    private int teacherPhone;
    private String teacherActive;

    public Teacher( String teacherName, String teacherEmail, int teacherPhone, String teacherActive) {
        this.teacherId = count("teacher_id","teachers")+1;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
        this.teacherActive = teacherActive;
    }

    public Teacher() {
    }
    

    public Teacher(int teacherId, String teacherName, String teacherEmail, int teacherPhone, String teacherActive) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
        this.teacherActive = teacherActive;
    }
    
    // getters and setters for each field
    public int getTeacherId() {
        return teacherId;
    }
    
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public int getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(int teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherActive() {
        return teacherActive;
    }

    public void setTeacherActive(String teacherActive) {
        this.teacherActive = teacherActive;
    }



    public static void addTeacher(Teacher teacher) {
        try {
            String query = "INSERT INTO teachers (teacher_name,teacher_email,teacher_phone,teacher_active) VALUES (?,?,?,?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setString(1, teacher.getTeacherName());
            statement.setString(2, teacher.getTeacherEmail());
            statement.setInt(3, teacher.getTeacherPhone());
            statement.setString(4, teacher.getTeacherActive());
            statement.executeUpdate();
            System.out.println("تمت إضافة المدرس بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة المدرس!");
            e.printStackTrace();
        }
    }

    
       
     public static boolean updateTeacher(Teacher teacher) {
        boolean success = false;
        try {
            String query = "UPDATE teachers SET teacher_name=?, teacher_email=? , teacher_phone=? , teacher_active=?  WHERE teacher_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);    
            statement.setString(1, teacher.getTeacherName());
            statement.setString(2, teacher.getTeacherEmail());
            statement.setInt(3, teacher.getTeacherPhone());
            statement.setString(4, teacher.getTeacherActive());
            statement.setInt(5, teacher.getTeacherId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }

    
    
 @Override
    public List<Teacher> display() {
        List<Teacher> teachers = new ArrayList<>();
        try {
            String query = "SELECT * FROM teachers";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int teacher_id = resultSet.getInt("teacher_id");
                String teacher_name = resultSet.getString("teacher_name");
                String teacher_email = resultSet.getString("teacher_email");
                int teacher_phone = resultSet.getInt("teacher_phone");
                String teacher_active = resultSet.getString("teacher_active");
                System.out.println("Teacher Id = "+teacher_id);
                System.out.println("Teacher Name = "+teacher_name);
                System.out.println("Teacher email = "+teacher_email);
                System.out.println("Teacher phone = "+teacher_phone);
                System.out.println("Teacher active = "+teacher_active);
                System.out.println("=========================================================");
                Teacher teacher = new Teacher(teacher_id,teacher_name,teacher_email,teacher_phone,teacher_active);
                teachers.add(teacher);
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض المواد!");
            e.printStackTrace();
        }
        return teachers;
    }

    
    @Override
    public void delete(int  teacherId) {
        try {
            String query = "DELETE FROM  teachers WHERE  teacher_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1,  teacherId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("تم حذف المدرس بنجاح!");
            } else {
                System.out.println("لم يتم العثور على المدرس المحددة!");
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء حذف المدرس!");
            e.printStackTrace();
        }
    }
    
 
    
    @Override
    public void search(String teacherName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM teachers WHERE teacher_name LIKE '%"+teacherName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int teacher_id = resultSet.getInt("teacher_id");
                String teacher_name = resultSet.getString("teacher_name");
                String teacher_email = resultSet.getString("teacher_email");
                int teacher_phone = resultSet.getInt("teacher_phone");
                String teacher_active = resultSet.getString("teacher_active");
                System.out.println("=========================================================");
                System.out.println("Teacher Id = "+teacher_id);
                System.out.println("Teacher Name = "+teacher_name);
                System.out.println("Teacher email = "+teacher_email);
                System.out.println("Teacher phone = "+teacher_phone);
                System.out.println("Teacher active = "+teacher_active);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }  
    } 
    
    
    
    @Override
    public void search(int teacherId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM teachers WHERE teacher_id LIKE '%"+teacherId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int teacher_id = resultSet.getInt("teacher_id");
                String teacher_name = resultSet.getString("teacher_name");
                String teacher_email = resultSet.getString("teacher_email");
                int teacher_phone = resultSet.getInt("teacher_phone");
                String teacher_active = resultSet.getString("teacher_active");
                System.out.println("=========================================================");
                System.out.println("Teacher Id = "+teacher_id);
                System.out.println("Teacher Name = "+teacher_name);
                System.out.println("Teacher email = "+teacher_email);
                System.out.println("Teacher phone = "+teacher_phone);
                System.out.println("Teacher active = "+teacher_active);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }  
    } 
    
    
    
}