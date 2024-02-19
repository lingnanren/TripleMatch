package com.andy.triple;

/**
 *
 * @author yza
 * @date 2024/2/18
 */
public class Main {
    public static void main(String[] args) {

        TripleCharacterTemplate template = new RemoveTripleCharacter();
        template.process("aabcccbbad");
        System.out.println("=============");
        template = new ReplaceTripleCharacter();
        template.process("abcccbad");
    }
}
