package com.in28minutes.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamcrestMatchersTest {

    @Test
    public void learning(){
        List<Integer>numbers= Arrays.asList(12,15,45);

        assertThat(numbers,hasSize(3));     //assertEquals(3,numbers.size());
        assertThat(numbers,hasItems(12,45));
        assertThat(numbers,everyItem(greaterThan(10)));
        assertThat(numbers,everyItem(lessThan(100)));

        assertThat("",isEmptyString());
        assertThat("ABCDE",containsString("BCD"));
        assertThat("ABCDE",startsWith("ABC"));
        assertThat("ABCDE",endsWith("CDE"));
    }
}
