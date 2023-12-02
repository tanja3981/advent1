package de.universa.advent1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trebuchet {

    public int parse(String[] lines) {
        List<Integer> results = new ArrayList<>();
        for (String line : lines) {
            results.add(parseLine(line));
        }

        return results.stream().mapToInt(i -> i.intValue()).sum();
    }

    public int parseLine(String line) {
        int first;
        int last;

        Stream<Character> charStr = line.chars().mapToObj(i -> (char) i);
        List<Integer> ints = charStr
                .filter(f -> Character.isDigit(f))
                .map(f -> Integer.valueOf("" + f))
                .collect(Collectors.toList());

        if (ints.size() > 0) {
            first = ints.get(0);
            last = ints.get(ints.size() - 1);
        } else {
            throw new RuntimeException("fehlerhaftes Array");
        }
        return first * 10 + last;
    }

    public int parseLine2(String line) {
//first digit oder zahl ermitteln
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isDigit(c)) {

            }
            int e =isEnum(line.substring(i));


        }
        //last digit oder zahl ermitteln

return -1;
    }

    public int isEnum(String s) {
        for (Zahlen z : Zahlen.values()) {
            if (s.startsWith(z.toString()))
                return z.intValue();
        }
        return -1;
    }
}
