class AddBinary {
    public String addBinary(String a, String b) {
        String revResult = "";
        int i = a.length() - 1, j = b.length() - 1;
        char carry = '0';
        int min = a.length() < b.length() ? a.length() : b.length();
        int count = 0;
        while (count < min) {
            if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                if (carry == '0') {
                    revResult += "0";
                }
                else {
                    revResult += "1";
                    carry = '0';
                }
            }
            if ((a.charAt(i) == '1' && b.charAt(j) == '0') || (a.charAt(i) == '0' && b.charAt(j) == '1')) {
                if (carry == '0') {
                    revResult += "1";
                }
                else {
                    revResult += "0";
                }
            }
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (carry == '0') {
                    revResult += "0";
                    carry = '1';
                }
                else {
                    revResult += "1";
                }
            }
            i--;
            j--;
            count++;
        }
        while (i >= 0) {
            if (a.charAt(i) == '0' && carry == '0') {
                revResult += "0";
            }
            else if (a.charAt(i) == '1' && carry == '0') {
                revResult += "1";
            }
            else if (a.charAt(i) == '0' && carry == '1') {
                revResult += "1";
                carry = '0';
            }
            else if (a.charAt(i) == '1' && carry == '1') {
                revResult += "0";
            }
            i--;
        }
        while (j >= 0) {
            if (b.charAt(j) == '0' && carry == '0') {
                revResult += "0";
            }
            else if (b.charAt(j) == '1' && carry == '0') {
                revResult += "1";
            }
            else if (b.charAt(j) == '0' && carry == '1') {
                revResult += "1";
                carry = '0';
            }
            else if (b.charAt(j) == '1' && carry == '1') {
                revResult += "0";
            }
            j--;
        }
        if (carry == '1') {
            revResult += "1";
        }
        return (new StringBuilder(revResult)).reverse().toString();
    }
}