public class Main {

    public static void main(String[] args) {
        int n = 5; // Change the value of n to print different sizes
        printSquarePattern(n);
        printTrianglePattern(n);
        printPyramidPattern(n);
        printDiamondPattern(n);
        printHourglassPattern(n);
        printHollowSquarePattern(n);
        printHollowRectanglePattern(n, 7); // Width 7 for example
        printHollowTrianglePattern(n);
        printHollowPyramidPattern(n);
        printHollowDiamondPattern(n);
        printHollowHourglassPattern(n);
        //     printNumberPyramidPattern(n);
        //     printNumberTrianglePattern(n);
    }

    // Method to print a square pattern
    public static void printSquarePattern(int n) {
        System.out.println("Square Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a triangle pattern
    public static void printTrianglePattern(int n) {
        System.out.println("Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a pyramid pattern
    public static void printPyramidPattern(int n) {
        System.out.println("Pyramid Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a diamond pattern
    public static void printDiamondPattern(int n) {
        System.out.println("Diamond Pattern:");
        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print an hourglass pattern
    public static void printHourglassPattern(int n) {
        System.out.println("Hourglass Pattern:");
        // Upper part of the hourglass
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part of the hourglass
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow square pattern
    public static void printHollowSquarePattern(int n) {
        System.out.println("Hollow Square Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow rectangle pattern
    public static void printHollowRectanglePattern(int n, int m) {
        System.out.println("Hollow Rectangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow triangle pattern
    public static void printHollowTrianglePattern(int n) {
        System.out.println("Hollow Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow pyramid pattern
    public static void printHollowPyramidPattern(int n) {
        System.out.println("Hollow Pyramid Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i == n - 1 || j == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow diamond pattern
    public static void printHollowDiamondPattern(int n) {
        System.out.println("Hollow Diamond Pattern:");
        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a hollow hourglass pattern
    public static void printHollowHourglassPattern(int n) {
        System.out.println("Hollow Hourglass Pattern:");
        // Upper part of the hourglass
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // Lower part of the hourglass
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a number pyramid pattern
   /* public static void printNumberPyramidPattern(int n) {
        System.out.println("Number Pyramid Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print a number triangle pattern
    public static void printNumberTrianglePattern(int n) {
        System.out.println("Number Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }*/
}