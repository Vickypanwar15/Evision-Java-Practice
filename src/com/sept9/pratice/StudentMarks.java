package com.sept9.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMarks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(56);
        marks.add(67);
        marks.add(87);
        marks.add(74);
        marks.add(43);
        marks.add(34);
        marks.add(73);
        System.out.println("Without change marks list");
        System.out.println(marks);

        System.out.println("after grace the marks list");
        List<Integer> graceMarks = marks.stream().map(i->i+6).collect(Collectors.toList());
        System.out.println(graceMarks);


    }
}
