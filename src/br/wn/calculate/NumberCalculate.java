package br.wn.calculate;

/**
 *
 * @author Wenceslau
 */
public class NumberCalculate {

    public static void main(String[] args) {
        System.out.println(input(21, 199));
    }

    public static int input(int numA, int numB) {

        String strNumC = "", strToAppendC = "", strNumA = String.valueOf(numA), strNumB = String.valueOf(numB);

        int lenA = strNumA.length(), lenB = strNumB.length(), lenUse = lenA;

        if (lenA > lenB) {
            lenUse = lenB;
            strToAppendC = strNumA.substring(lenB);
        } else if (lenA < lenB) {
            lenUse = lenA;
            strToAppendC = strNumB.substring(lenA);
        }

        char[] charA = strNumA.toCharArray(), charB = strNumB.toCharArray();

        for (int i = 0; i < lenUse; i++) {
            strNumC += charA[i];
            strNumC += charB[i];
        }
        strNumC += strToAppendC;

        if (Long.parseLong(strNumC) > 1000000L) {
            return -1;
        }

        return Integer.parseInt(strNumC);
    }

}
