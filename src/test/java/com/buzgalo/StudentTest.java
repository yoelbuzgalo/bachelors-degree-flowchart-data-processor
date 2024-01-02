package com.buzgalo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.buzgalo.models.Degree;
import com.buzgalo.models.Semester;
import com.buzgalo.models.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentTest {

    private static final String expectedSchool = "Rochester Institute of Technology";
    private static final String expectedName = "Yoel";
    private static final String expectedMajor = "Software Engineering";
    private static final int expectedCredits = 127;
    private static final Degree expectedDegree = Degree.BS;

    @Test
    @DisplayName("Student Info Test")
    public void instantiationTest(){
        // Invoke
        Student student = new Student(expectedSchool, expectedName, expectedMajor, expectedCredits, expectedDegree);

        // Analysis
        assertEquals(expectedName, student.getName());
    }

    @Test
    @DisplayName("Student Print Test")
    public void toStringTest(){
        // Invoke
        Student student = new Student(expectedSchool, expectedName, expectedMajor, expectedCredits, expectedDegree);

        // Analysis
        System.out.println(student.toString());
    }

    @Test
    @DisplayName("Student Add Semester Test")
    public void addSemesterTest(){
        // Setup
        Student student = new Student(expectedSchool, expectedName, expectedMajor, expectedCredits, expectedDegree);
        Semester semester_1 = new Semester(2023, Semester.Season.FALL);
        Semester semester_2 = new Semester(2024, Semester.Season.SPRING);

        // Invoke
        student.addSemester(semester_1);
        student.addSemester(semester_2);

        // Analysis
        assertEquals(2, student.getSemesters().size());
        assertEquals(semester_1, student.getSemesters().get(0));

    }
}