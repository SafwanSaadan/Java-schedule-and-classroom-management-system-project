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
public class Course extends Database {
    private int id;
    private String name;
    private int majorId;
    private String majorName;

    public Course( String name, int majorId) {
        this.id = count("course_id","courses")+1;
        this.name = name;
        this.majorId = majorId;
    }

    public Course(int id, String name, int majorId) {
        this.id = id;
        this.name = name;
        this.majorId = majorId;
    }
    
   public Course(int id, String name, String majorName) {
        this.id = id;
        this.name = name;
        this.majorName = majorName;
    }

    public Course() {
        
    }
    
    

    // getters and setters for each field

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        String name = null;
        try {
        String query1 = "SELECT major_name FROM majors WHERE major_id = "+getMajorId()+";";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
            resultSet1.next();
            name = resultSet1.getString("major_name");
        } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
        return name;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }


    
  public static void addCourse(Course course) {
        try {
            String query = "INSERT INTO courses (course_id,course_name,major_id) VALUES (?,?,?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1, course.getId());
            statement.setString(2, course.getName());
            statement.setInt(3, course.getMajorId());
            statement.executeUpdate();
            System.out.println("تمت إضافة المادة بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة المادة!");
            e.printStackTrace();
        }
    }
  
  
     public static boolean updateCourse(Course course) {
        boolean success = false;
        try {
            String query = "UPDATE courses SET course_name=?, major_id=? WHERE course_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setString(1, course.getName());
            statement.setInt(2, course.getMajorId());
            statement.setInt(3, course.getId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }
  

    @Override
    public List<Course> display() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "SELECT * FROM courses";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int courseId = resultSet.getInt("course_id");
                String courseName = resultSet.getString("course_name");
                int major_Id = resultSet.getInt("major_id");
                System.out.println("Course Id = "+courseId);
                System.out.println("Course Name = "+courseName);
                System.out.println("major Id = "+major_Id);
                System.out.println("=========================================================");
                Course course = new Course(courseId,courseName,major_Id);
                courses.add(course);
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض المواد!");
            e.printStackTrace();
        }
        return courses;
    }

    
    
    @Override
    public void delete(int  courseId) {
        try {
            String query = "DELETE FROM  courses WHERE  course_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1,  courseId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("تم حذف المادة بنجاح!");
            } else {
                System.out.println("لم يتم العثور على المادة المحددة!");
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء حذف المادة!");
            e.printStackTrace();
        }
    }
    
    
  

    @Override
    public void search(String courseName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM courses WHERE course_name LIKE '%"+courseName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int course_Id = resultSet.getInt("course_id");
                String course_Name = resultSet.getString("course_name");
                int major_Id = resultSet.getInt("major_id");
                System.out.println("=========================================================");
                System.out.println("Course Id = "+course_Id);
                System.out.println("Course Name = "+course_Name);
                System.out.println("major Id = "+major_Id);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    @Override
    public void search(int courseId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM courses WHERE course_id LIKE '%"+courseId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int course_Id = resultSet.getInt("course_id");
                String course_Name = resultSet.getString("course_name");
                int major_Id = resultSet.getInt("major_id");
                System.out.println("=========================================================");
                System.out.println("Course Id = "+course_Id);
                System.out.println("Course Name = "+course_Name);
                System.out.println("major Id = "+major_Id);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
}