package org.example.jacoco.strings.turkish;

import org.springframework.stereotype.Service;
import java.text.Normalizer;
import java.util.Locale;

@Service
public class TurkishStringService {

    @SuppressWarnings("deprecation")
    private static final Locale TURKISH_LOCALE = new Locale("tr", "TR");

    public String toUpperCaseTurkish(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase(TURKISH_LOCALE);
    }

    public String toLowerCaseTurkish(String input) {
        if (input == null) {
            return null;
        }
        return input.toLowerCase(TURKISH_LOCALE);
    }

    public String removeAccents(String input) {
        if (input == null) {
            return null;
        }
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
    }
}
