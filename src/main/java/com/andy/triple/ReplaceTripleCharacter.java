package com.andy.triple;

/**
 * remove triple or more consecutive characters from string
 *
 * @author yza
 * @date 2024/2/18
 */
public class ReplaceTripleCharacter extends TripleCharacterTemplate{

    @Override
    protected String operate(String str, int[] indexArray) {
        // if not found triple characters, return it
        if (indexArray[0] == -1) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);
        while (indexArray[0] != -1) {
            char oldChar = str.charAt(indexArray[0]);
            if ('a' == oldChar) {
                // when the triple charactor is 'a', no need other char to replace it
                sb.replace(indexArray[0], indexArray[1] + 1, "");
            } else {
                // use character before it alphabetically to replace.
                char newChar = (char) (oldChar - 1);
                sb.replace(indexArray[0], indexArray[1] + 1, String.valueOf(newChar));
            }
            indexArray = findTripleChar(sb.toString());
//            System.out.println("-> " + sb.toString());
        }

        return sb.toString();
    }
}
