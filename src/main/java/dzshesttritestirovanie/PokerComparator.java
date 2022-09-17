package dzshesttritestirovanie;

import java.util.Arrays;

public class PokerComparator {
    public static int compare(String... cards){
        int answer = 0;
        String s[] = cards;
        char[] chars;
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                answer = -1;
                if (s[i] != null) {
                    chars = s[i].toCharArray();
                    for (int j = 0; j < chars.length; j++) {
                        if (Character.isLetter(chars[j]) || Character.isDigit(chars[j])) {
                            answer = 0;
                        }
                    }
                    if (answer == -1) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (s == null || answer == -1) {
            answer = -1;
            return answer;
        }
        for (int i = 0; i < s.length; i++) {
            String[] words = s[i].split(" ");
            if (words.length != 5) {
                answer = -2;
                return answer;
            }
        }
        String[][] massCards = new String[13][4];
        for (int i = 0; i < 4; i++) {
            char ch = 0;
            if (i == 0) {
                ch = 'Б';
            }
            if (i == 1) {
                ch = 'Т';
            }
            if (i == 2) {
                ch = 'П';
            }
            if (i == 3) {
                ch = 'Ч';
            }
            for (int j = 0; j < 13; j++) {
                if (j < 9) {
                    massCards[j][i] = new StringBuilder(String.valueOf(j + 2)).append(ch).toString();
                }
                if (j == 9) {
                    massCards[j][i] = new StringBuilder(String.valueOf('В')).append(ch).toString();
                }
                if (j == 10) {
                    massCards[j][i] = new StringBuilder(String.valueOf('Д')).append(ch).toString();
                }
                if (j == 11) {
                    massCards[j][i] = new StringBuilder(String.valueOf('К')).append(ch).toString();
                }
                if (j == 12) {
                    massCards[j][i] = new StringBuilder(String.valueOf('Т')).append(ch).toString();
                }
            }
        }
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            String[] words = s[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < massCards.length; k++) {
                    for (int l = 0; l < massCards[k].length; l++) {
                        if (words[j].equals(massCards[k][l])) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        if (count == 5 * s.length) {
            answer = 1;
        } else {
            answer = -3;
            return answer;
        }
        if (s.length == 1) {
            return answer;
        }
        for (int i = 0; i < s.length; i++) {
            String[] words = s[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < massCards.length; k++) {
                    for (int l = 0; l < massCards[k].length; l++) {
                        if (words[j].equals(massCards[k][l])) {
                            massCards[k][l] = String.valueOf(i);
                            break;
                        }
                    }
                }
            }
        }
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            for (int k = massCards.length - 1; k >= 0 && result[i] == 0; k--) {
                for (int l = 0; l < massCards[k].length && result[i] == 0; l++) {
                    if (String.valueOf(i).equals(massCards[k][l])) {
                            result[i] = k;
                            break;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 1; i < result.length; i++) {
            if (result[i] > result[i - 1]) {
                max = i;
            }
        }
        answer = max + 1;
        int[][] result1 = new int[13][s.length];
        for (int i = 0; i < s.length; i++) {
            for (int k = 0; k < massCards.length; k++) {
                for (int l = 0; l < massCards[k].length; l++) {
                    if (String.valueOf(i).equals(massCards[k][l])) {
                        result1[k][i] += 1;
                    }
                }
            }
        }
        boolean para = false;
        int[] resultPara = new int[s.length];
        for (int i = result1.length - 1; i >= 0; i--) {
            for (int j = 0; j < result1[i].length; j++) {
                if (result1[i][j] == 2) {
                    resultPara[j] = i + 1;
                    para = true;
                }
            }
        }
        if (para) {
            int maxPara = 0;
            int resPara = resultPara[0];
            for (int i = 1; i < resultPara.length; i++) {
                if (resultPara[i] > resPara) {
                    maxPara = i;
                    resPara = resultPara[i];
                }
            }
            answer = maxPara + 1;
        }

        boolean twopara = false;
        int[][] resultTwoPara = new int[2][s.length];
        for (int i = 0; i < s.length; i++) {
            int count2 = 0;
            for (int j = 12; j >= 0; j--) {
                if (result1[j][i] == 2) {
                    resultTwoPara[count2][i] = j + 1;
                    count2++;
                }
            }
            if (count2 > 1) {
                twopara = true;
            }
        }
        if (twopara) {
            int maxtwoPara = 0;
            int maxPara = resultTwoPara[0][0];
            for (int i = 1; i < resultPara.length; i++) {
                if (resultTwoPara[0][i] > resultTwoPara[0][i - 1]) {
                    maxPara = resultTwoPara[0][i];
                }
            }
            for (int i = 0; i < resultPara.length; i++) {
                if (resultTwoPara[0][i] < maxPara) {
                    resultTwoPara[0][i] = 0;
                    resultTwoPara[1][i] = 0;
                }
            }
            for (int i = 1; i < resultPara.length; i++) {
                if (resultTwoPara[0][i] + resultTwoPara[1][i] > resultTwoPara[0][i - 1] + resultTwoPara[1][i - 1]) {
                    maxtwoPara = i;
                }
            }
            answer = maxtwoPara + 1;
        }
        boolean threeCards = false;
        int[] resultThreeCards = new int[s.length];
        for (int i = result1.length - 1; i >= 0; i--) {
            for (int j = 0; j < result1[i].length; j++) {
                if (result1[i][j] == 3) {
                    resultThreeCards[j] = i + 1;
                    threeCards = true;
                }
            }
        }
        if (threeCards) {
            int maxThreeCards = 0;
            int resThreeCards = resultThreeCards[0];
            for (int i = 1; i < resultThreeCards.length; i++) {
                if (resultThreeCards[i] > resThreeCards) {
                    maxThreeCards = i;
                    resThreeCards = resultThreeCards[i];
                }
            }
            answer = maxThreeCards + 1;
        }
        boolean street = false;
        int[] resultStreet = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            int count3 = 0;
            for (int j = 0; j < 9; j++) {
                if (result1[j][i] > 1) {
                    break;
                }
                if (result1[j][i] == 1) {
                    count3 = 1;
                    for (int k = j + 1; k < j + 5; k++) {
                        if (result1[k][i] == 1) {
                            count3 ++;
                        }
                    }
                }
                if (count3 == 5) {
                    resultStreet[i] = j + 1;
                    street = true;
                }
            }
        }
        if (street) {
            int maxStreet = resultStreet[0];
            int str = 0;
            for (int i = 1; i < resultStreet.length; i++) {
                if (resultStreet[i] > maxStreet) {
                    str = i;
                    maxStreet = resultStreet[i];
                }
            }
            answer = str + 1;
        }
        return answer;
    }
}
