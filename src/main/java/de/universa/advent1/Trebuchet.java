package de.universa.advent1;

import java.nio.charset.Charset;
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
            String line2 = prepareLine(line);
            results.add(parseLine(line2));
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

    public String prepareLine(String line) {
        char[] charArray = line.toCharArray();

//first digit oder zahl ermitteln
        for (int i = 0; i < charArray.length; i++) {

            int e = isEnum(line.substring(i));
            if (e != -1) {
                StringBuilder builder = new StringBuilder(line);
                char c=(char)(e+'0');
                builder.setCharAt(i, c);
                return prepareLine(builder.toString());
            }
        }
        //last digit oder zahl ermitteln

        return line;
    }

    public int isEnum(String s) {
        for (Zahlen z : Zahlen.values()) {
            if (s.startsWith(z.toString()))
                return z.intValue();
        }
        return -1;
    }
}
