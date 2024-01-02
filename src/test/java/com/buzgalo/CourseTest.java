package com.buzgalo;

import com.buzgalo.models.Course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest
{
    // Setup
    private static final String courseName = "Software Development and Problem Solving 1";
    private static final String courseCatalog = "GCIS-123";
    private static final int courseCredit = 4;
    private static final String requiredGrade = "C-";
    private static final String courseGrade = null;


    @Test
    @DisplayName("Course Test")
    void instantiationTest() {
        // Invoke
        Course course = new Course(courseName, courseCatalog, courseCredit, requiredGrade, courseGrade);

        //Analysis
        assertEquals(courseName, course.getCourseName());
        assertEquals(courseCatalog, course.getCourseCatalog());
        assertEquals(courseCredit, course.getCourseCredit());
        assertEquals(courseGrade, course.getCourseGrade());
        assertFalse(course.isAchieved());
    }

    @Test
    @DisplayName("Is Achieved Test")
    void isAchievedTestTrue(){
        // Setup
        Course course_1 = new Course(courseName, courseCatalog, courseCredit, requiredGrade, "A");
        Course course_2 = new Course(courseName, courseCatalog, courseCredit, requiredGrade, "D");

        // Invoke
        boolean actual_1 = course_1.isAchieved();
        boolean actual_2 = course_2.isAchieved();

        //Analysis
        assertTrue(actual_1);
        assertFalse(actual_2);
    }
}
