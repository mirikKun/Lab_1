package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void parseLine()
    {
        List<String> expected=(Arrays.asList("10", "AU", "", "Australia"));

        List<String> actual =Parser.parseLine("10,AU,,Australia",',','\"');
        assertEquals(expected, actual);
    }
}