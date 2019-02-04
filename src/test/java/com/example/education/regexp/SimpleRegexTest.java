package com.example.education.regexp;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SimpleRegexTest {

    private static final String REGEX = "^[bc]*[a]+[bc]+";

    @Test
    public void viaFind() {
        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(runTest(REGEX, "aaaabbcch")).as("1-st").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "bbaaaacch")).as("2-nd").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "ccaaacch")).as("3-rd").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "bbaaaabbh")).as("4-th").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "absc")).as("5-th").isEqualTo(1);

        soft.assertAll();
    }

        private static int runTest(String regex, String text) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            int matches = 0;
            while (matcher.find()) {
                matches++;
            }
            return matches;
        }
}
