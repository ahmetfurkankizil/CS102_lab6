package CS102_lab6;

import java.io.File;

public class Question1 {

    //Question 1
    public static int recursiveCount(String s) {
        if (s==null || s.isEmpty())
            return 0;
        int lengthOfSubString = recursiveCount(s.substring(1));
        return lengthOfSubString + 1;
    }

    //Question 2
    public static boolean isNonVowel(char c) {
        char lowerCh = Character.toLowerCase(c);
        String nonVowels = "BbCcDdFfGgJjKkLlMmNnPpQqSsTtVvXxZzHhRrWwYy";
        return nonVowels.indexOf(lowerCh) != -1;
    }
    public static int recursiveNonVowels(String s) {
        int count = 0;
        if (s.isEmpty()) {
            return 0;
        }
        if (isNonVowel(s.charAt(0))) {
            count = 1;
        }
        return count+recursiveNonVowels(s.substring(1));
    }

    //Question 3
    public static void recursiveBinary(String str, int n) {
        if (n <= str.length()) {
            System.out.println(str);
        } else {
            if (str.charAt(str.length() - 1) == '0') {
                recursiveBinary(str+"1", n);
                recursiveBinary(str+"0", n);
            } else {
                recursiveBinary(str+"0", n);
            }
        }
    }

    //Question 4


    public static int countingNoOfFiles(String s) {
        File directoryFound = new File(s);
        if (!directoryFound.exists()) {
            return 0;
        }
        return recursiveMethod(directoryFound.listFiles(), 0);
    }

    //The index idea is taken from the tutor
    private static int recursiveMethod(File[]  f , int  i) {
        if (i >= f.length) {
            return 0;
        }

        File fileFound = f[i];

        if (fileFound.isFile()) {
            return 1+recursiveMethod(f, i + 1);
        }
        else if (fileFound.isDirectory()) {
            return recursiveMethod(f, i + 1) + countingNoOfFiles(fileFound.getAbsolutePath());
        }

        //Functions like a for loop with the use of recursion
        return recursiveMethod(f, i + 1);
    }




    public static void main(String[] args) {
        //Question 1
        System.out.println(recursiveCount("CS102 is the best"));
        //Question 2
        System.out.println(recursiveNonVowels("CS102 is a good course"));
        //Question 3
        recursiveBinary("1",4);
        recursiveBinary("0",4);
        //Question 4
        System.out.println(countingNoOfFiles("/Users/ahmetfurkankizil/Desktop/folder1"));


    }
}
