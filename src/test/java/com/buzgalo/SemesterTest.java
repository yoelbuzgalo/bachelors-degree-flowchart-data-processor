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
    static private final Course _course1 = new Course("A", "ABC-123", 3, "C", "A");
    static private final Course _course2 = new Course("B", "DEF-123", 3, "C", "B");
    static private final Course _course3 = new Course("C", "GHI-123", 3, "C", "C");
    static private final Course _course4NotFinished = new Course("D", "JKL-123", 3, "A", null);
    static private final Course _course5Failed = new Course("E", "MNO-123", 3, "C", "D");

    @Test
    @DisplayName("Semester Info Test")
    public void instantiationTest(){
        // Invoke
        Semester semester = new Semester(_year, _season);

        //Analysis
        assertEquals(_year, semester.getYear());
        assertEquals(_season, semester.getSeason());
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
        assertEquals(3, semester.getCourseList().size());
        assertEquals(_course1, semester.getCourseList().get(0));
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
        assertEquals(expectedGPA, result);
    }

    @Test
    @DisplayName("Achieved credits per semester test")
    public void achievedTest(){
        // Setup
        Semester semester = new Semester(_year, _season);
        semester.addCourseToList(_course1);
        semester.addCourseToList(_course2);
        semester.addCourseToList(_course3);
        semester.addCourseToList(_course4NotFinished);
        semester.addCourseToList(_course5Failed);
        int expectedResult = 9;

        // Invoke
        int actual = semester.getAchieved();

        // Analysis
        assertEquals(expectedResult, actual);

    }


}
