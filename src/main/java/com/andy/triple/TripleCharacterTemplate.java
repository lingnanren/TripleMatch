package com.andy.triple;

/**
 * Template desire pattern class
 *
 * @author yza
 * @date 2024/2/18
 */
public abstract class TripleCharacterTemplate {


    /**
     * minimum triple character length
     */
    private static final int MIN_LENGTH_STRING = 3;

    /**
     * define how to process string (remove/replace)
     * @param str input string
     * @param indexArray The array only contain start and end index of consecutive string
     * @return result string
     */
    protected abstract String operate(String str, int[] indexArray);


    /**
     * find the consecutive string start and end index
     * @param str target string
     * @return The array contain consecutive string start and end index, {-1, -1} means not found it.
     */
    protected int[] findTripleChar(String str) {
        legalCheck(str);

        int[] index = {-1, -1};
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                int j = i + 2;
                // more than 3 characters are same
                while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                    j++;
                }
                index[0] = i;
                index[1] = j;
                break;
            }
        }
        return index;
    }

    /**
     * check the string is llegal
     * @param str input string
     */
    protected void legalCheck(String str) {
        String regx = "^[a-z]*$";
        if (!str.matches(regx)) {
            throw new IllegalArgumentException("input string illegal! It should only contain 'a-z' characters");
        }
    }

    /**
     * process string template function
     * @param str input string
     * @return process result
     */
    public final String process(String str) {

        if (str.length() < MIN_LENGTH_STRING) {
            return str;
        }

        return operate(str, findTripleChar(str));
    }

}
