//link to the problem https://leetcode.com/problems/can-place-flowers/description/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean empty = flowerbed[i] == 0;
            boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

            if (empty && leftEmpty && rightEmpty) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
// Time Complexity: O(n), where n is the length of the flowerbed array.
// Space Complexity: O(1), since we are using only a constant amount of extra space.