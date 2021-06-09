class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        return str.length >= 1 ? str[str.length - 1].length() : 0;
    }
}