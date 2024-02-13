/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import projecttable.UI.Login;
/**
 *
 * @author Safwan
 */
public class Main {
    public static void main(String[] args) {
        // إنشاء كائنات من الكلاسات المختلفة
//        Major specialization = new Major("1", "Computer Science");
//        Course subject = new Course("1", "Programming", 3, specialization);
//        Teacher teacher = new Teacher("1", "John Doe", specialization);
//        Classroom classroom = new Classroom("1", "Room 101", 30, true);
//        Department section = new Department("1", "Section A", 30);
//        Schedule schedule = new Schedule("1", classroom, teacher, subject, section, "Monday 9:00-12:00");

        // إضافة العلاقات بين الكائنات
//        specialization.addSubject(subject);
//        teacher.addSchedule(schedule);
//        classroom.addSchedule(schedule);

        // استخدام الكائنات والعلاقات بينها لإجراء عمليات مختلفة
        // ...
//        Course c = new Course("project managment",2);
//        Course.addCourse(c);
//        Course.getAllCourse();
//        Course.deleteDepartment(3);
//        Course.getAllCourse();
//            Course c1 = new Course(2,"java",1);
//            Course.updateCourse(c1);
//            Course.getAllCourse();

//        Course.searchCourse("java");
//        Department.searchDepartment("IT");

//            Classroom cl = new Classroom(2,"502",40,"FCIT",true);
//            Classroom.addClassroom(cl);
//            Classroom.updateClassroom(cl);
//            Classroom.searchClassroom("501");
//            Classroom.deleteClassroom(2);
//            Classroom.displayClassroom();

//Database d = new Major("BIT",1,15,1);
//Major.addMajor(m);
//Major.updateMajor(m);
//Major.deleteMajor(2);
//Major.searchMajor("IT");
//Major.displayMajor();
//d.display();

// d = new Teacher("safwan sadaan","ssssss@gmail.com",735878939,true);
//// d.display();
// d.search("M");
//Teacher t = new Teacher(6,"mohammed alsawti","mohammed@gmail.com",789998883,true);
//Teacher.addTeacher(t);
//Teacher.updateTeacher(t);
//Teacher.deleteTeacher(3);
//Teacher.search("a");
//Teacher.displayTeacher();
//d.search("s");
//d.display();



//LocalTime start = LocalTime.of(12, 0, 0);
//LocalTime end = LocalTime.of(2, 0, 0);
//// d.display();
//Schedule s = new Schedule(9,"IT",1,1,6,2,1,"mon",Time.valueOf(start),Time.valueOf(end));
//Schedule.addSchedule(s);
//Schedule.updateSchedule(s);

//Schedule.searchSchedule("IT");
// d = new Schedule("IT",1,1,4,6,5,"mon",Time.valueOf(start),Time.valueOf(end));
//d.delete(2);
// d.display();
// d.search("I");

//        System.out.println(d.count("teacher_id", "teachers"));

//d = new Course("python",2);
//d.display();
//Department.display();
//q.display();



//Classroom classroom = new Classroom();
//List<Classroom> classrooms = classroom.display();
//        System.out.println( classrooms.getClass());
//        System.out.println(classrooms.spliterator());



//    Classroom c = new Classroom();
    
//    List<Classroom> list = c.display();
////     DefaultTableModel tabModel = (DefaultTableModel)jTable.getModel();
//     Object[] row = new Object[5];
//     for (int i = 0; i < list.size(); i++) {
//        row[0] = list.get(i).getId();
//        row[1] = list.get(i).getName();
//        row[2] = list.get(i).getCapacity();
//        row[3] = list.get(i).getLocation();
//        row[4] = list.get(i).isactive();
////        tabModel.addRow(row);
//    }
        
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Login().setVisible(true);
            }
        });
        
        
        

    }
}
