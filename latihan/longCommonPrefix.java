public class longCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String[] strs1 = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String keyStr = strs[0];
        int j = 1;
        for (int i = 0; i < strs[0].length(); i++) {
            for (j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return keyStr.substring(0, i);
                }
            }
        }
        return keyStr;
    }

}
