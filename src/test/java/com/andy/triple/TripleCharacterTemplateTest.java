package com.andy.triple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test case
 *
 * @author yza
 * @date 2024/2/18
 */
class TripleCharacterTemplateTest {

    @Test
    void testRemoveTripleCharacter() {
        RemoveTripleCharacter removeTripleCharacter = new RemoveTripleCharacter();

        // Test input without consecutive triple characters
        assertEquals("aabbad", removeTripleCharacter.process("aabbad"));

        // Test input with consecutive triple characters
        assertEquals("d", removeTripleCharacter.process("aabcccbbad"));

        // Test input with consecutive triple characters at the beginning
        assertEquals("ad", removeTripleCharacter.process("aaabbbad"));

        // Test input with consecutive triple characters at the end
        assertEquals("", removeTripleCharacter.process("aabbbadddd"));

        // Test input with consecutive triple characters in the middle
        assertEquals("aabbadd", removeTripleCharacter.process("aabcccbadd"));

        // Test input more than 3 consecutive characters
        assertEquals("d", removeTripleCharacter.process("aabcccccbbbad"));

        // Test input with empty characters
        assertEquals("", removeTripleCharacter.process(""));

        // Test input with illegal characters
        assertThrows(IllegalArgumentException.class, () -> removeTripleCharacter.process("123"));
        assertThrows(IllegalArgumentException.class, () -> removeTripleCharacter.process("#@#"));

    }

    @Test
    void testReplaceTripleCharacter() {
        ReplaceTripleCharacter replaceTripleCharacter = new ReplaceTripleCharacter();

        // Test input without consecutive triple characters
        assertEquals("aabbad", replaceTripleCharacter.process("aabbad"));

        // Test input with consecutive triple characters
        assertEquals("d", replaceTripleCharacter.process("aabcccbbad"));

        // Test input with consecutive triple characters at the beginning
        assertEquals("bbcd", replaceTripleCharacter.process("aaabbcd"));

        // Test input with consecutive triple characters at the end
        assertEquals("", replaceTripleCharacter.process("aabbbadddd"));

        // Test input with consecutive more than 3 characters
        assertEquals("dd", replaceTripleCharacter.process("aabccccbbadd"));

        // Test input with empty characters
        assertEquals("", replaceTripleCharacter.process(""));

        // Test input with illegal characters
        assertThrows(IllegalArgumentException.class, () -> replaceTripleCharacter.process("123"));
        assertThrows(IllegalArgumentException.class, () -> replaceTripleCharacter.process("#@#"));
    }
}
