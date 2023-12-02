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
        System.out.println(result); //55386
         assertEquals(55386, result);

    }


    @Test
    void isEnum() {
        //final String txt = "8five9ttqst2one2vz";

        Trebuchet t = new Trebuchet();
        assertEquals(5, t.isEnum("five9ttqst2one2vz"));

    }
}