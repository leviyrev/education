package com.example.education.regexp;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpRegexTest {

    //    private static final String REGEX = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
    private static final String REGEX = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    @Test
    public void viaFind() {
        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(runTest(REGEX, "12.1.4.145")).as("1-st").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "111.1.1.1")).as("2-nd").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "255.255.255.255")).as("3-rd").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "0.0.0.0")).as("4-th").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "255.0.0.0")).as("5-th").isEqualTo(1);
        soft.assertThat(runTest(REGEX, "257.0.0.0")).as("6-th").isEqualTo(0);
        soft.assertThat(runTest(REGEX, "250.-1.0.0")).as("7-th").isEqualTo(0);
        soft.assertThat(runTest(REGEX, "1.1.1.1.1")).as("8-th").isEqualTo(0);
        soft.assertThat(runTest(REGEX, "1.1.1.1q")).as("9-th").isEqualTo(0);

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
