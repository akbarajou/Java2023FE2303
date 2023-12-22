/**
 * Task: Count the number of Duplicates
 */

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int count = 0;
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            String firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(firstLetter)) {
                count++;
                text = text.replace(firstLetter, "");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));
    }
}
