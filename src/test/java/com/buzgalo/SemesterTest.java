package com.buzgalo;

import com.buzgalo.models.Course;
import com.buzgalo.models.Semester;
import com.buzgalo.models.Semester.Season;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class SemesterTest {
    // Setup
    static private final int _year = 2023;
    static private final Season _season = Season.FALL;
    static private final Course _course1 = new Course("A", "ABC-123", 3, "B");
    static private final Course _course2 = new Course("B", "DEF-123", 3, "B");
    static private final Course _course3 = new Course("C", "GHI-123", 3, "B");

    @Test
    @DisplayName("Semester Info Test")
    public void instantiationTest(){
        // Invoke
        Semester semester = new Semester(_year, _season);

        //Analysis
        assertEquals(semester.getYear(), _year);
        assertEquals(semester.getSeason(), _season);
        assertTrue(semester.getCourseList().isEmpty());
    }

    @Test
    @DisplayName("Add To Course Test")
    public void addCourseTest(){
        // Invoke
        Semester semester = new Semester(_year, _season);
        semester.addCourseToList(_course1);
        semester.addCourseToList(_course2);
        semester.addCourseToList(_course3);

        // Analysis
        assertEquals(semester.getCourseList().size(), 3);
        assertEquals(semester.getCourseList().get(0), _course1);
    }

    @Test
    @DisplayName("GPA Test")
    public void gpaTest4(){
        // Setup
        double expectedGPA = 3.0;

        // Invoke
        Semester semester = new Semester(_year, _season);
        semester.addCourseToList(_course1);
        semester.addCourseToList(_course2);
        semester.addCourseToList(_course3);
        double result = semester.getGPA();

        // Analysis
        assertEquals(result, expectedGPA);
    }


}
