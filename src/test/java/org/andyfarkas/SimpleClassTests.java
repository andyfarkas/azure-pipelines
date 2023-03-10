package org.andyfarkas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleClassTests {

    @Test
    public void success() {
        assertTrue(new SimpleClass().method());
    }

    @Test
    public void fail() {
        assertFalse(new SimpleClass().method());
    }

}