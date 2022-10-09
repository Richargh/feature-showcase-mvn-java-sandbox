package de.richargh.sandbox.features;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddressTest {

    @Test
    void records_are_compared_by_value() {
        // GIVEN
        var testee1 = new Address("221B Baker St.", "London");
        var testee2 = new Address("221B Baker St.", "London");
        // WHEN
        var result = testee1.equals(testee2);
        // THEN
        assertThat(result).isTrue();
    }
}
