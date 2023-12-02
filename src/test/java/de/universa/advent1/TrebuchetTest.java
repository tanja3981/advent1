package de.universa.advent1;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class TrebuchetTest {

    @Test
    void parseInput1() throws IOException {
        File file = new File(ClassLoader.getSystemResource("Input.txt").getFile());
        List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);

        Trebuchet t = new Trebuchet();
        int result = t.parse(lines.toArray(new String[lines.size()]));
        System.out.println(result); 
        // assertEquals(55386, result); part 1!

    }

    @Test void parseLine() {
        Trebuchet t = new Trebuchet();

        assertEquals(36, t.parseLine("rtkrbtthree8sixfoureight6"));
        assertEquals(17, t.parseLine("onetjcsmgk57nvmkvcvkdtqtsksgpchsfsjzkkmb"));
        assertEquals(62, t.parseLine("six8threepvlxttc85two"));
        assertEquals(45, t.parseLine("fourtwofivesix5"));
        assertEquals(14, t.parseLine("zoneight234"));
        assertEquals(76, t.parseLine("7pqrstsixteen"));
    }


    @Test
    void isEnum() {
        //final String txt = "8five9ttqst2one2vz";

        Trebuchet t = new Trebuchet();
        assertEquals(5, t.isEnum("five9ttqst2one2vz"));

    }

    @Test
    void prepareLine() {

        final String in = "oneeightsevenfive1";
        Trebuchet t = new Trebuchet();
        String result = t.prepareLine(in);
        assertEquals("1neeight7even5ive1", result);
    }
}