package edu.pdx.cs410J.room10;

import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearRoom10Test {
    @Test
    void fourHundredIsDivisibleBy400() {
        assertThat(LeapYearRoom10.isLeapYear(400), equalTo(true));
    }
}
