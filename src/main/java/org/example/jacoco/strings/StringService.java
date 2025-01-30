package org.example.jacoco.strings;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }
}
