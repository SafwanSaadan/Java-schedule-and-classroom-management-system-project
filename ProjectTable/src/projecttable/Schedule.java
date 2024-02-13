/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.sql.Time;


/**
 *
 * @author Safwan
 */

public class Schedule extends Database {
    private int tableId;
    private String tableName;
    private int majorId;
    private String majorNmae;
    private int level;
    private int courseId;
    private String course;
    private int teacherId;
    private String teacher;
    private int classId;
    private String className;
    private String day;
    private String startTime;
    private String endTime;
    

//        LocalTime start = LocalTime.of(startTime, 0, 0);
//        LocalTime end = LocalTime.of(endTime, 0, 0); 

    public Schedule(String tableName, int majorId, int level, int courseId, int teacherId, int classId, String day, String startTime, String endTime) {
        this.tableId = count("table_id","schedules")+1;
        this.tableName = tableName;
        this.majorId = majorId;
        this.level = level;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.classId = classId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Schedule(int tableId,String tableName, String majorNmae, int level, int courseId, int teacherId, int classId, String day, String startTime, String endTime) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.majorNmae = majorNmae;
        this.level = level;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.classId = classId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    
        public Schedule(int tableId, String tableName, int majorId, int level, int courseId, int teacherId, int classId, String day, String startTime, String endTime) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.majorId = majorId;
        this.level = level;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.classId = classId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Schedule(int tableId, String tableName, String majorNmae, int level, String course, String teacher, String className, String day, String startTime, String endTime) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.majorNmae = majorNmae;
        this.level = level;
        this.course = course;
        this.teacher = teacher;
        this.className = className;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }
        

    public Schedule() {
    }

    
    // getters and setters for each field

    public int getTableId() {
        return tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorNmae() {
        return majorNmae;
    }

    public void setMajorNmae(String majorNmae) {
        this.majorNmae = majorNmae;
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
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    
    
  public static void addSchedule(Schedule schedule) {
        try {
            String query = "INSERT INTO schedules (table_id,table_name,majorId,level,courseId,teacherId,classroomId,day,startTime,endTime) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1, schedule.getTableId());
            statement.setString(2, schedule.getTableName());
            statement.setInt(3, schedule.getMajorId());
            statement.setInt(4, schedule.getLevel());
            statement.setInt(5, schedule.getCourseId());
            statement.setInt(6, schedule.getTeacherId());
            statement.setInt(7, schedule.getClassId());
            statement.setString(8, schedule.getDay());
            statement.setString(9, schedule.getStartTime());
            statement.setString(10, schedule.getEndTime());
            statement.executeUpdate();
            System.out.println("تمت إضافة جدول بنجاح!");
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء إضافة جدول!");
            e.printStackTrace();
        }
    }

    
           
     public static boolean updateSchedule(Schedule schedule) {
        boolean success = false;
        try {                             
            String query = "UPDATE schedules SET table_name=?, majorId=? , level=? , courseId=? ,teacherId=?, classroomId=? ,day=? ,startTime=? , endTime=? WHERE table_id=?";
            PreparedStatement statement = Database.conn().prepareStatement(query);    
            statement.setString(1, schedule.getTableName());
            statement.setInt(2, schedule.getMajorId());
            statement.setInt(3, schedule.getLevel());
            statement.setInt(4, schedule.getCourseId());
            statement.setInt(5, schedule.getTeacherId());
            statement.setInt(6, schedule.getClassId());
            statement.setString(7, schedule.getDay());
            statement.setString(8, schedule.getStartTime());
            statement.setString(9, schedule.getEndTime());
            statement.setInt(10, schedule.getTableId());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return success;
    }
     
     
     
     
@Override
public List<Schedule> display() {
    List<Schedule> schedules = new ArrayList<>();
    try {
        String query = "SELECT * FROM schedules";
        PreparedStatement statement = Database.conn().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
 
//        System.out.println( "+"+"=".repeat(125)+"+");
        System.out.println("=========================================================");
        String header = String.format("| %-4s | %-5s | %-5s | %-30s | %-20s | %-10s | %-8s | %-8s | %-8s |",
        "ID","major", "level", "course", "teacher", "classroom", "day", "startTime","endTime");
        System.out.println(header);
        System.out.println("=========================================================");
//        System.out.println( "+"+"=".repeat(125)+"+");
        
        while (resultSet.next()) {
            int tableId = resultSet.getInt("table_id");
            String tableName = resultSet.getString("table_name");
            int maId = resultSet.getInt("majorId");
            int coId = resultSet.getInt("courseId");
            int tId = resultSet.getInt("teacherId");
            int clId = resultSet.getInt("classroomId");
            
            String query1 = "SELECT major_name FROM majors WHERE major_id = "+maId+";";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
            resultSet1.next();
            String major_name = resultSet1.getString("major_name");
            
            int level = resultSet.getInt("level");
            
            String query2 = "SELECT course_name FROM courses WHERE course_id = "+coId+";";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
            resultSet2.next();
            String course_name = resultSet2.getString("course_name");
            
            String query3 = "SELECT teacher_name FROM teachers WHERE teacher_id = "+tId+";";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
            resultSet3.next();
            String teacher_name = resultSet3.getString("teacher_name");
            
            String query4 = "SELECT class_name FROM classrooms WHERE class_id = "+clId+";";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            resultSet4.next();
            String class_name = resultSet4.getString("class_name");
            
            String day = resultSet.getString("day");
            String startTime = resultSet.getString("startTime");
            String endTime = resultSet.getString("endTime");
            
            
            String row = String.format("| %-5d| %-5s | %-5d | %-30s | %-20s | %-10s | %-8s | %-9s | %-8s |",
        tableId,major_name, level, course_name, teacher_name, class_name, day, startTime, endTime);
            System.out.println(row);
            
//            System.out.println( "+"+"-".repeat(125)+"+");
            System.out.println("=========================================================");
            Schedule schedule = new Schedule(tableId,tableName,major_name,level,course_name,teacher_name,class_name,day,startTime,endTime);
            schedules.add(schedule);
        }
//        System.out.println( "+"+"=".repeat(125)+"+");
        System.out.println("=========================================================");
    } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
    return schedules;
}
    
    
    @Override
    public void delete(int  scheduleId) {
        try {
            String query = "DELETE FROM  schedules WHERE  table_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setInt(1,  scheduleId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("تم حذف الجدول بنجاح!");
            } else {
                System.out.println("لم يتم العثور على الجدول المحددة!");
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء حذف الجدول!");
            e.printStackTrace();
        }
    }
    
    
        public void delete(String  scheduleId) {
        try {
            String query = "DELETE FROM  schedules WHERE  table_id = ?";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            statement.setString(1,  scheduleId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("تم حذف الجدول بنجاح!");
            } else {
                System.out.println("لم يتم العثور على الجدول المحددة!");
            }
        } catch (SQLException e) {
            System.out.println("حدث خطأ أثناء حذف الجدول!");
            e.printStackTrace();
        }
    }
 

    @Override
    public void search(String scheduleName){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM schedules WHERE table_name LIKE '%"+scheduleName+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
//            System.out.println( "+"+"=".repeat(125)+"+");
            System.out.println("=========================================================");
        String header = String.format("| %-4s | %-5s | %-5s | %-30s | %-20s | %-10s | %-8s | %-8s | %-8s |",
        "ID","major", "level", "course", "teacher", "classroom", "day", "startTime","endTime");
        System.out.println(header);
//        System.out.println( "+"+"=".repeat(125)+"+");
        System.out.println("=========================================================");
        
        while (resultSet.next()) {
            int tableId = resultSet.getInt("table_id");
            int maId = resultSet.getInt("majorId");
            int coId = resultSet.getInt("courseId");
            int tId = resultSet.getInt("teacherId");
            int clId = resultSet.getInt("classroomId");
            
            String query1 = "SELECT major_name FROM majors WHERE major_id = "+maId+";";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
            resultSet1.next();
            String major_name = resultSet1.getString("major_name");
            
            int level = resultSet.getInt("level");
            
            String query2 = "SELECT course_name FROM courses WHERE course_id = "+coId+";";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
            resultSet2.next();
            String course_name = resultSet2.getString("course_name");
            
            String query3 = "SELECT teacher_name FROM teachers WHERE teacher_id = "+tId+";";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
            resultSet3.next();
            String teacher_name = resultSet3.getString("teacher_name");
            
            String query4 = "SELECT class_name FROM classrooms WHERE class_id = "+clId+";";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            resultSet4.next();
            String class_name = resultSet4.getString("class_name");
            
            String day = resultSet.getString("day");
            Time startTime = resultSet.getTime("startTime");
            Time endTime = resultSet.getTime("endTime");
            
            
            String row = String.format("| %-5d| %-5s | %-5d | %-30s | %-20s | %-10s | %-8s | %-9s | %-8s |",
        tableId,major_name, level, course_name, teacher_name, class_name, day, startTime.toString(), endTime.toString());
            System.out.println(row);
            
//            System.out.println( "+"+"-".repeat(125)+"+");
            System.out.println("=========================================================");
        }
//        System.out.println( "+"+"=".repeat(125)+"+");
        System.out.println("=========================================================");
    } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
  }
    
    
    
    @Override
    public void search(int scheduleId){
        try {
            // إعداد الاستعلام الذي يقوم بالبحث عن القيمة في الجدول
            String query = "SELECT * FROM schedules WHERE table_id LIKE '%"+scheduleId+"%'";
            PreparedStatement statement = Database.conn().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
//            System.out.println( "+"+"=".repeat(125)+"+");
            System.out.println("=========================================================");
        String header = String.format("| %-4s | %-5s | %-5s | %-30s | %-20s | %-10s | %-8s | %-8s | %-8s |",
        "ID","major", "level", "course", "teacher", "classroom", "day", "startTime","endTime");
        System.out.println(header);
//        System.out.println( "+"+"=".repeat(125)+"+");
        System.out.println("=========================================================");
        
        while (resultSet.next()) {
            int tableId = resultSet.getInt("table_id");
            int maId = resultSet.getInt("majorId");
            int coId = resultSet.getInt("courseId");
            int tId = resultSet.getInt("teacherId");
            int clId = resultSet.getInt("classroomId");
            
            String query1 = "SELECT major_name FROM majors WHERE major_id = "+maId+";";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
            resultSet1.next();
            String major_name = resultSet1.getString("major_name");
            
            int level = resultSet.getInt("level");
            
            String query2 = "SELECT course_name FROM courses WHERE course_id = "+coId+";";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
            resultSet2.next();
            String course_name = resultSet2.getString("course_name");
            
            String query3 = "SELECT teacher_name FROM teachers WHERE teacher_id = "+tId+";";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
            resultSet3.next();
            String teacher_name = resultSet3.getString("teacher_name");
            
            String query4 = "SELECT class_name FROM classrooms WHERE class_id = "+clId+";";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            resultSet4.next();
            String class_name = resultSet4.getString("class_name");
            
            String day = resultSet.getString("day");
            Time startTime = resultSet.getTime("startTime");
            Time endTime = resultSet.getTime("endTime");
            
            
            String row = String.format("| %-5d| %-5s | %-5d | %-30s | %-20s | %-10s | %-8s | %-9s | %-8s |",
        tableId,major_name, level, course_name, teacher_name, class_name, day, startTime.toString(), endTime.toString());
            System.out.println(row);
            
//            System.out.println( "+"+"-".repeat(125)+"+");
            System.out.println("=========================================================");
        }
//        System.out.println( "+"+"=".repeat(125)+"+");
          System.out.println("=========================================================");
    } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
  }
    
    
}