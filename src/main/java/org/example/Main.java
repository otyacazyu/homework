package org.example;

import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("yamada","tanaka","yasuda","suzuki","iida","satou","tatibana");
        List<String> result = names.stream().filter(name -> name.startsWith("t")).toList();
        names.stream().filter(name -> name.length() <= 5).forEach(out::println);
        out.println(result);
    }
        }
