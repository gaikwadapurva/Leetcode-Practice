class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int index = digits.length - 1;
        int sum = digits[index] + carry + 1;
        if (sum <= 9) {
            digits[index] = sum;
        }
        else {
            carry = (digits[index] + 1) / 10;
            digits[index] = (digits[index] + 1) % 10;
            index--;
            while (index >= 0 && sum > 9) {
                sum = digits[index] + carry;
                digits[index] = sum % 10;
                carry = sum / 10;
                index--;
            }
            if (sum <= 9) {
                return digits;
            }
            else {
                int result[] = new int[digits.length + 1];
                result[0] = carry;
                for (int i = 0, j = 1; i < digits.length && j < result.length; i++, j++) {
                    result[j] = digits[i];
                }
                return result;
            }
        }
        return digits;
    }
}