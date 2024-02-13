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
public class Classroom extends Database{
    private int id;
    private String name;
    private int capacity;
    private String location;
    private String active;


    public Classroom( String name, int capacity, String location, String active) {
        this.id = count("class_id","classrooms")+1;
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.active = active;
    }

    public Classroom(int id, String name, int capacity, String location, String active) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.active = active;
    }

    public Classroom() {
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


    
      public static void addClassroom(Classroom classroom) {
        try {
            String query = "INSERT INTO classrooms (class_id,class_name,class_capacity,class_location,class_active) VALUES (?,?,?,?,?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1, classroom.getId());
            statement.setString(2, classroom.getName());
            statement.setInt(3, classroom.getCapacity());
            statement.setString(4, classroom.getLocation());
            statement.setString(5, classroom.getActive());
            statement.executeUpdate();
            System.out.println("تمت إضافة المادة بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة المادة!");
            e.printStackTrace();
        }
    }

        public static boolean updateClassroom(Classroom classroom) {
        boolean success = false;
        try {
            String query = "UPDATE classrooms SET class_name=?, class_capacity=? , class_location=? , class_active=? WHERE class_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            
            statement.setString(1, classroom.getName());
            statement.setInt(2, classroom.getCapacity());
            statement.setString(3, classroom.getLocation());
            statement.setString(4, classroom.getActive());
            statement.setInt(5, classroom.getId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }
      
      
      
     
@Override
    public List<Classroom> display() {
        List<Classroom> classrooms = new ArrayList<>();
        try {
            String query = "SELECT * FROM classrooms";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int class_id = resultSet.getInt("class_id");
                String class_name = resultSet.getString("class_name");
                int class_capacity = resultSet.getInt("class_capacity");
                String class_location = resultSet.getString("class_location");
                String class_active = resultSet.getString("class_active");
                System.out.println("classroom Id = "+class_id);
                System.out.println("classroom Name = "+class_name);
                System.out.println("classroom capacity = "+class_capacity);
                System.out.println("classroom location = "+class_location);
                System.out.println("classroom active = "+class_active);
                System.out.println("=========================================================");
                Classroom classroom = new Classroom(class_id,class_name,class_capacity,class_location,class_active);
                classrooms.add(classroom);
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض المواد!");
            e.printStackTrace();
        }
        return classrooms;
    }

    
    
    @Override
    public void delete(int  classroomId) {
        try {
            String query = "DELETE FROM  classrooms WHERE  class_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1,  classroomId);
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
    public void search(String classroomName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM classrooms WHERE class_name LIKE '%"+classroomName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int class_id = resultSet.getInt("class_id");
                String class_name = resultSet.getString("class_name");
                int class_capacity = resultSet.getInt("class_capacity");
                String class_location = resultSet.getString("class_location");
                String class_active = resultSet.getString("class_active");
                System.out.println("=========================================================");
                System.out.println("classroom Id = "+class_id);
                System.out.println("classroom Name = "+class_name);
                System.out.println("classroom capacity = "+class_capacity);
                System.out.println("classroom location = "+class_location);
                System.out.println("classroom active = "+class_active);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    @Override
    public void search(int classroomId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM classrooms WHERE class_id LIKE '%"+classroomId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int class_id = resultSet.getInt("class_id");
                String class_name = resultSet.getString("class_name");
                int class_capacity = resultSet.getInt("class_capacity");
                String class_location = resultSet.getString("class_location");
                String class_active = resultSet.getString("class_active");
                System.out.println("=========================================================");
                System.out.println("classroom Id = "+class_id);
                System.out.println("classroom Name = "+class_name);
                System.out.println("classroom capacity = "+class_capacity);
                System.out.println("classroom location = "+class_location);
                System.out.println("classroom active = "+class_active);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
}

    
