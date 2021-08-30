public class Main {
    public static boolean arrayStringsAreEqual( String[] word1, String[] word2) {
        String Words1 = null,Words2 = null;
        for (int i=0;i<word1.length;i++)
        {
            Words1+=word1[i];
        }
        for (int i=0;i<word2.length;i++)
        {
            Words2+=word2[i];
        }
        return Words1.equals(Words2);
    }
    public static void main(String[] args) {
        String word1[] = {"ab", "cd", "ef"};
        String word2[] = {"ab", "cd", "ef"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
