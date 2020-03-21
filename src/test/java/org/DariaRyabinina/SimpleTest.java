package org.DariaRyabinina;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SimpleTest {
    @Test
    public void simpleTest() {
        BigDecimal weight = new BigDecimal(60.2).setScale(3, BigDecimal.ROUND_HALF_UP);
        List<String> jobs = Arrays.asList("Художник", "Поэт", "Музыкант");
        Person vasia = new Person("Василий", 45, weight, jobs);
        assertThat(vasia)
                .as("Вассилий")
                .hasFieldOrProperty("name")
                .hasFieldOrPropertyWithValue("name", "Василий")
                .hasFieldOrPropertyWithValue("age",45);
    }
}
