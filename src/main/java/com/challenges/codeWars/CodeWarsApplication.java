package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.Arrays;
import java.util.regex.Pattern;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static boolean getXO(String str) {
        String[] amountXO = str.split("");
        int countX = 0;
        int countY = 0;

        for (int i = 0; i <= amountXO.length - 1; i++) {
            if (amountXO[i].equalsIgnoreCase("x")) {
                countX++;
            }
            if (amountXO[i].equalsIgnoreCase("o")) {
                countY++;
            }
        }
        return countX == countY;
    }

}
