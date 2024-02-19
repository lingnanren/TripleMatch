package com.andy.triple;

/**
 * remove triple or more consecutive characters from string
 *
 * @author yza
 * @date 2024/2/18
 */
public class RemoveTripleCharacter extends TripleCharacterTemplate{

    @Override
    protected String operate(String str, int[] indexArray) {

        if (indexArray[0] == -1) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);
        while (indexArray[0] != -1) {
            sb.delete(indexArray[0], indexArray[1] + 1);
            indexArray = findTripleChar(sb.toString());
//            System.out.println("-> " + sb.toString());
        }

        return sb.toString();
    }
}
