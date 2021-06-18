class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        if (temp.equals(sb.toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}