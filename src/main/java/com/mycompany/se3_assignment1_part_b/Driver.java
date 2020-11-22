package com.mycompany.se3_assignment1_part_b;

import com.mycompany.se3_assignment1.Student;
import com.mycompany.se3_assignment1.Course;
import com.mycompany.se3_assignment1.Module;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Conn O'Flynn
 */
public class Driver {
    
    public static void main(String[] args){ 
        
        Course course1 = new Course("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(2020,9,10,0,00), new DateTime(2024,5,15,23,59));
        Course course2 = new Course("Electrical Engineering", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(2020,9,10,0,00), new DateTime(2024,5,15,23,59));
        
        Module module1 = new Module("Programming","P101");
        Module module2 = new Module("Software Engineering","SE101");
        Module module3 = new Module("Database Systems","DB101");
        Module module4 = new Module("Stuctural Engineering","P101");
        Module module5 = new Module("Computer Engineering","P101");
        Module module6 = new Module("Mathematics","M101");
        Module module7 = new Module("Computer Systems","CS101");
        
        ArrayList<Module> compModules = new ArrayList<Module>();
        ArrayList<Module> engModules = new ArrayList<Module>();
        
        compModules.add(module1);
        compModules.add(module2);
        compModules.add(module3);
        compModules.add(module7);
        
        engModules.add(module1);
        engModules.add(module2);
        engModules.add(module4);
        engModules.add(module5);
        engModules.add(module6);
        
        course1.setModules(compModules);
        course2.setModules(engModules);
            
        Student student1 = new Student("Niamh", 24, "24/06/1996", 15445178);
        Student student2 = new Student("John", 22, "12/09/1998", 15445178);
        Student student3 = new Student("Bob", 23, "05/03/1997", 15445178);
        Student student4 = new Student("Mary", 24, "24/07/1996", 15445178);
        Student student5 = new Student("Jack", 21, "20/06/1999", 15445178);
        
        ArrayList<Student> compStudents = new ArrayList<Student>();
        ArrayList<Student> engStudents = new ArrayList<Student>();
        
        compStudents.add(student1);
        compStudents.add(student2);
        compStudents.add(student3);
        
        engStudents.add(student4);
        engStudents.add(student5);
        
        course1.setStudents(compStudents);
        course2.setStudents(engStudents);
        
        course1.addModule(new Module("Algorithms","A101"));
        
        student1.addModule(new Module("French Introduction", "FR101"));
        
        System.out.println(course1);
        System.out.println(course2);
        
        System.out.println(student1.printModules());
        System.out.println(student5.printModules());
        
    }
}
