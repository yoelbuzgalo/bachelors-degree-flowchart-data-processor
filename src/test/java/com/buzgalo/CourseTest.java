package com.buzgalo;

import com.buzgalo.models.Course;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTest
{
    // Setup
    private static final String courseName = "Software Development and Problem Solving 1";
    private static final String courseCatalog = "GCIS-123";
    private static final int courseCredit = 4;
    private static final char courseGrade = 'A';


    @Test
    @DisplayName("Course Test")
    void instantiationTest() {
        //Invoke
        Course course = new Course(courseName, courseCatalog, courseCredit, courseGrade);

        //Analysis
        assertEquals(courseName, course.getCourseName());
        assertEquals(courseCatalog, course.getCourseCatalog());
        assertEquals(courseCredit, course.getCourseCredit());
        assertEquals(courseGrade, course.getCourseGrade());
        assertTrue(course.isAchieved());
    }
}
