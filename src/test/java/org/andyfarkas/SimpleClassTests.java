package org.andyfarkas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleClassTests {

    @Test
    @DisplayName("Test that the method returns true")
    public void success() {
        assertTrue(new SimpleClass().method());
    }

    @Test
    @DisplayName("Test that the method returns true")
    public void fail() {
        assertFalse(new SimpleClass().method());
    }

}