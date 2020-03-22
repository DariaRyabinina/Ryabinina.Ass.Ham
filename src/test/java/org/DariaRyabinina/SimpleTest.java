package org.DariaRyabinina;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SimpleTest {
    @Test(testName = "AssertJ")
    public void simpleTest1() {
        BigDecimal weight = new BigDecimal(60.2).setScale(3, BigDecimal.ROUND_HALF_UP);
        List<String> jobs = Arrays.asList("Художник", "Поэт", "Музыкант");
        Person vasia = new Person("Василий", 45, weight, jobs);
        Assertions.assertThat(vasia)
                .as("Вассилий")
                .hasFieldOrProperty("name")
                .hasFieldOrPropertyWithValue("name", "Василий")
                .hasFieldOrPropertyWithValue("age", 45);
        Assertions.assertThat(vasia.getJobs())
                .containsAnyOf("Поэт");
    }

    @Test(testName = "Hamcrest")
    public void simpleTest2() {
        BigDecimal weight = new BigDecimal(60.2).setScale(3, BigDecimal.ROUND_HALF_UP);
        List<String> jobs = Arrays.asList("Художник", "Поэт", "Музыкант");
        Person vasia = new Person("Василий", 45, weight, jobs);
        assertThat(vasia.getName(), equalTo("Василий"));
        assertThat(vasia.getAge(), equalTo(45));
        assertThat(vasia.getJobs(), hasItem("Поэт"));
    }

}
