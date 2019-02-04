package com.example.education.binaryops;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryOpsTest {

    @Test
    public void or() {
        assertThat(5 | 6).isEqualTo(7);
        assertThat(5 | 6).isEqualTo(7);
    }

    @Test
    public void xor() {
        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(1 ^ 3).as(" input 1 ").isEqualTo(2);
        soft.assertThat(2 ^ 3).as(" input 2 ").isEqualTo(1);
        soft.assertThat(3 ^ 3).as(" input 3 ").isEqualTo(0);
        soft.assertThat(4 ^ 3).as(" input 4 ").isEqualTo(7);
        soft.assertThat(5 ^ 3).as(" input 5 ").isEqualTo(6);
        soft.assertThat(6 ^ 3).as(" input 6 ").isEqualTo(5);

        soft.assertAll();
    }

    @Test
    public void and() {
        SoftAssertions soft = new SoftAssertions();

        soft.assertThat(1 & 3).as(" input 1 ").isEqualTo(1);
        soft.assertThat(2 & 3).as(" input 2 ").isEqualTo(2);
        soft.assertThat(3 & 3).as(" input 3 ").isEqualTo(3);
        soft.assertThat(4 & 3).as(" input 4 ").isEqualTo(0);
        soft.assertThat(5 & 3).as(" input 5 ").isEqualTo(1);
        soft.assertThat(6 & 3).as(" input 6 ").isEqualTo(2);

        soft.assertAll();
    }

    @Test
    public void nand() {
        System.out.println(5 | 6);
    }
}
