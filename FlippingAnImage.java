/*

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

*/

class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int flip[][] = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            int len = image[i].length;
            for (int x = 0, y = len - 1; x < len && y >= 0; x++, y--) {
                flip[i][x] = (image[i][y] + 1) % 2;
            }
        }
        return flip;
    }
}