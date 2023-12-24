public class Challenge_3 {
    public static void main(String[] args) {
        int[] array = {10, 12, 5, 2, 9, 8, 6};

        if (array.length < 2) {
            System.out.println("Array should have at least two elements");
        } else {
            int[] maxProductPair = findMaxProductPair(array);
            System.out.println("Two numbers with maximum product: " + maxProductPair[0] + " and " + maxProductPair[1]);
            System.out.println("Maximum product: " + (long) maxProductPair[0] * maxProductPair[1]);
        }
    }

    private static int[] findMaxProductPair(int[] array) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        // Compare the products of the two pairs (max1 * max2) and (min1 * min2)
        if ((long) firstMax * secondMax > (long) firstMin * secondMin) {
            return new int[]{firstMax, secondMax};
        } else {
            return new int[]{firstMin, secondMin};
        }
    }
}

