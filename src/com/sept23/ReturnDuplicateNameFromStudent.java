package com.sept23;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReturnDuplicateNameFromStudent {
    public static void main(String[] args) {
        List<Student> studentList = Student.addStudents();
        studentList.stream().collect(Collectors.groupingBy(Student::getName)).forEach((name,student)->{
            System.out.println(name+" : ");
            student.stream().sorted(Comparator.comparing(Student::getRoll).reversed()).forEach(System.out::println);
        });

//        collect(Collectors.groupingBy(Student::getName,Collectors.counting())) ---> Take the name from student and count that
//        it returns the Map object after that
//        Now we to convert map to the stream entrySet().stream()
//        After that filter the if value is > 1 than get the key and convert to the List


        List<String> names = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(names);
    }

}
