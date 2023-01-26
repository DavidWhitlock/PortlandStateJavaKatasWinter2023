package edu.pdx.cs410J.room10;

import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearRoom10Test {
    @Test
    void year400IsALeapYear() {
        assertThat(LeapYearRoom10.isLeapYear(400), equalTo(true));
    }
    @Test
    void year1700IsNotALeapYear(){
        assertThat(LeapYearRoom10.isLeapYear(1700), equalTo(false));
    }

    @Test
    void year2000IsALeapYear(){
        assertThat(LeapYearRoom10.isLeapYear(2000), equalTo(true));
    }

    @Test
    void year2008IsALeapYear(){
        assertThat(LeapYearRoom10.isLeapYear(2008), equalTo(true));
    }

    @Test
    void year2017IsNotALeapYear(){
        assertThat(LeapYearRoom10.isLeapYear(2017), equalTo(false));
    }
}
