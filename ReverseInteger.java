class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            long val = (long)(-1) * x;
            sb.append(val);
        }
        else {
            sb.append(x);
        }
        sb.reverse();
        String outputStr = "";
        if (x < 0) {
            outputStr = "-" + sb.toString();
        }
        else {
            outputStr = sb.toString();
        }
        long output = Long.parseLong(outputStr);
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;
        if (output < min || output > max) {
            return 0;
        }
        else {
            return Integer.parseInt(outputStr);
        }
    }
}