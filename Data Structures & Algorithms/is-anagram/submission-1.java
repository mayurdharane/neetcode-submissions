class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }else {

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();

            int len = t.length();
            for (int i = 0; i < sArr.length; i++) {

                for (int j = 0; j < tArr.length; j++) {
                    if (sArr[i] == tArr[j]) {
                        tArr[j] = '*';
                        len--;
                        break;
                    }
                }

            }
            return len == 0;
        }

    }
}
