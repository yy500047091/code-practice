package Iterator;

public class PatternPrinting {
    public static void main(String[] args) {
        printRightTriangle(5);
        printInvertedHalfPyramidNumbers(5);
        printRightAngledTriangleNumbers(5);
        printDiamondPattern(5);
        printPascalsTriangle(5);
        printHollowRectangle(5, 10);
        printNumberPatternPyramid(5);
        printHollowDiamond(5);
        printHollowPyramid(5);
        printHollowInvertedPyramid(5);
    }

    // Pattern 1: Right Triangle
    public static void printRightTriangle(int n) {
        System.out.println("Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 2: Inverted Half Pyramid of Numbers
    public static void printInvertedHalfPyramidNumbers(int n) {
        System.out.println("Inverted Half Pyramid of Numbers:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 3: Right-Angled Triangle of Numbers
    public static void printRightAngledTriangleNumbers(int n) {
        System.out.println("Right-Angled Triangle of Numbers:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 4: Diamond Pattern of Stars
    public static void printDiamondPattern(int n) {
        System.out.println("Diamond Pattern of Stars:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 5: Pascal's Triangle
    public static void printPascalsTriangle(int n) {
        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.format("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 6: Hollow Rectangle of Stars
    public static void printHollowRectangle(int rows, int columns) {
        System.out.println("Hollow Rectangle of Stars:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 7: Number Pattern Pyramid
    public static void printNumberPatternPyramid(int n) {
        System.out.println("Number Pattern Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 8: Hollow Diamond Pattern of Stars
    public static void printHollowDiamond(int n) {
        System.out.println("Hollow Diamond Pattern of Stars:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 9: Hollow Pyramid Pattern of Stars
    public static void printHollowPyramid(int n) {
        System.out.println("Hollow Pyramid Pattern of Stars:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 10: Hollow Inverted Pyramid of Stars
    public static void printHollowInvertedPyramid(int n) {
        System.out.println("Hollow Inverted Pyramid of Stars:");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
