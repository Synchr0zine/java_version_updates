package org.synchrozine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Stream from array
        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        //Stream from collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Microservices", 102)
        );

        Stream<Course> myCourseStream = myCourses.stream();

        //Stream values
        Stream<Integer> stream = Stream.of(1,2,3,4);



    }
}