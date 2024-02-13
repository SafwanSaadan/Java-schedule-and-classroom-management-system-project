
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
public class Department extends Database{
    private int departmentId;
    private String departmentName;
    private List<Major> majors; // هذه  قائمة التخصصات في القسم

    public Department(String departmentName) {
        this.departmentId = count("dep_id","departments")+1;
        this.departmentName = departmentName;
        this.majors = new ArrayList<>(); // تهيئة القائمة
    }
    
    public Department(int departmentId,String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.majors = new ArrayList<>(); // تهيئة القائمة
    }

    public Department() {
    }
    

    // Getters and Setters

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
 
    
    
    public static void addDepartment(Department department) {
        try {
            String query = "INSERT INTO departments (dep_name) VALUES (?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setString(1, department.getDepartmentName());
            statement.executeUpdate();
            System.out.println("تمت إضافة القسم بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة القسم!");
            e.printStackTrace();
        }
    }

    
    
    
    public static boolean updateDepartment(Department department) {
        boolean success = false;
        try {
            String query = "UPDATE departments SET dep_name=? WHERE dep_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setString(1, department.getDepartmentName());
            statement.setInt(2, department.getDepartmentId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }
         
    
    
    @Override
    public List<Department> display() {
        List<Department> departments = new ArrayList<>();
        try {
            String query = "SELECT * FROM departments";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int departmentId = resultSet.getInt("dep_id");
                String departmentName = resultSet.getString("dep_name");
                System.out.println("department Id = "+departmentId);
                System.out.println("department Name = "+departmentName);
                System.out.println("=========================================================");
                Department department = new Department(departmentId,departmentName);
                departments.add(department);
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الأقسام!");
            e.printStackTrace();
        }
        return departments;
    }

    
    
    @Override
    public void delete(int departmentId) {
        try {
            String query = "DELETE FROM departments WHERE dep_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1, departmentId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("تم حذف القسم بنجاح!");
            } else {
                System.out.println("لم يتم العثور على القسم المحدد!");
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء حذف القسم!");
            e.printStackTrace();
        }
    }
    
    
    
    @Override
    public void search(String departmentName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM departments WHERE dep_name LIKE '%"+departmentName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int departmentId = resultSet.getInt("dep_id");
                String department_Name = resultSet.getString("dep_name");
                System.out.println("=========================================================");
                System.out.println("department Id = "+departmentId);
                System.out.println("department Name = "+department_Name);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
         
    @Override
    public void search(int depId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM departments WHERE dep_id LIKE '%"+depId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int departmentId = resultSet.getInt("dep_id");
                String department_Name = resultSet.getString("dep_name");
                System.out.println("=========================================================");
                System.out.println("department Id = "+departmentId);
                System.out.println("department Name = "+department_Name);
                System.out.println("=========================================================");
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    
}
