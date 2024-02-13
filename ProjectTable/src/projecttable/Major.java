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

public class Major extends Database{
    private int majorId;
    private String majorName;
    private int[] level ={1,2,3,4};
    private int numStudent;
    private int levelIn;
    private int departmentId; // هذا رقم القسم المرتبط بالتخصص

    public Major( String majorName, int levelIn, int numStudent, int departmentId) {
        this.majorId = count("major_id","majors")+1;
        this.majorName = majorName;
        this.numStudent = numStudent;
        this.levelIn = levelIn;
        this.departmentId = departmentId; // تعيين رقم القسم
    }

    public Major(int majorId, String majorName, int numStudent, int levelIn, int departmentId) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.numStudent = numStudent;
        this.levelIn = levelIn;
        this.departmentId = departmentId;
    }

    public Major() {
    }


    // getters and setters for each field

    public int getMajorId() {
        return majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public int[] getLevel() {
        return level;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getLevelIn() {
        return levelIn;
    }

    public void setLevelIn(int levelIn) {
        this.levelIn = levelIn;
    }

 
public String getDeptName() {
        String name = null;
        try {
        String query1 = "SELECT dep_name FROM departments WHERE dep_id = "+getDepartmentId()+";";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
            resultSet1.next();
            name = resultSet1.getString("dep_name");
        } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
        return name;
    }
    
       
  public static void addMajor(Major major) {
        try {
            String query = "INSERT INTO majors (major_id,major_name,level,num_students,dep_id) VALUES (?,?,?,?,?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1, major.getMajorId());
            statement.setString(2, major.getMajorName());
            statement.setInt(3, major.getLevelIn());
            statement.setInt(4, major.getNumStudent());
            statement.setInt(5, major.getDepartmentId());
            statement.executeUpdate();
            System.out.println("تمت إضافة المادة بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة المادة!");
            e.printStackTrace();
        }
    }
  
  
     
     public static boolean updateMajor(Major major) {
        boolean success = false;
        try {
            String query = "UPDATE majors SET major_name=?, level=? , num_students=? , dep_id=?  WHERE major_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);    
            statement.setString(1, major.getMajorName());
            statement.setInt(2, major.getLevelIn());
            statement.setInt(3, major.getNumStudent());
            statement.setInt(4, major.getDepartmentId());
            statement.setInt(5, major.getMajorId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }
     
     

  @Override
    public List<Major> display() {
        List<Major> majors = new ArrayList<>();
        try {
            String query = "SELECT * FROM majors";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int major_id = resultSet.getInt("major_id");
                String major_name = resultSet.getString("major_name");
                int level = resultSet.getInt("level");
                int num_students = resultSet.getInt("num_students");
                int dep_id = resultSet.getInt("dep_id");
                System.out.println("major Id = "+major_id);
                System.out.println("major Name = "+major_name);
                System.out.println("level = "+level);
                System.out.println("num students = "+num_students);
                System.out.println("Department Id = "+dep_id);
                System.out.println("=========================================================");
                Major major = new Major(major_id,major_name,level,num_students,dep_id);
                majors.add(major);
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض المواد!");
            e.printStackTrace();
        }
        return majors;
    }

    
    
    @Override
    public void delete(int  majorId) {
        try {
            String query = "DELETE FROM  majors WHERE  major_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1,  majorId);
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
    public void search(String majorName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM majors WHERE major_name LIKE '%"+majorName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int major_id = resultSet.getInt("major_id");
                String major_name = resultSet.getString("major_name");
                int level = resultSet.getInt("level");
                int num_students = resultSet.getInt("num_students");
                int dep_id = resultSet.getInt("dep_id");
                System.out.println("=========================================================");
                System.out.println("major Id = "+major_id);
                System.out.println("major Name = "+major_name);
                System.out.println("level = "+level);
                System.out.println("num students = "+num_students);
                System.out.println("Department Id = "+dep_id);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
 
    @Override
    public void search(int majorId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM majors WHERE major_id LIKE '%"+majorId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int major_id = resultSet.getInt("major_id");
                String major_name = resultSet.getString("major_name");
                int level = resultSet.getInt("level");
                int num_students = resultSet.getInt("num_students");
                int dep_id = resultSet.getInt("dep_id");
                System.out.println("=========================================================");
                System.out.println("major Id = "+major_id);
                System.out.println("major Name = "+major_name);
                System.out.println("level = "+level);
                System.out.println("num students = "+num_students);
                System.out.println("Department Id = "+dep_id);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    

    
}
    

