import java.util.Scanner;

class Queens {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x1 = reader.nextInt();
        int y1 = reader.nextInt();
        int x2 = reader.nextInt();
        int y2 = reader.nextInt();

        if (y2 == y1 || x2 == x1) {
            System.out.println("YES");
            return;
        }
        if (y1 == x1 - 7) {
           if (y2 == x2 - 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
           return;
        }
        if (y1 == x1 - 6) {
            if (y2 == x2 - 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 - 5) {
            if (y2 == x2 - 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 - 4) {
            if (y2 == x2 - 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 - 3) {
            if (y2 == x2 - 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 - 2) {
            if (y2 == x2 - 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 - 1) {
            if (y2 == x2 - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1) {
            if (y2 == x2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 7) {
            if (y2 == x2 + 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 6) {
            if (y2 == x2 + 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 5) {
            if (y2 == x2 + 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 4) {
            if (y2 == x2 + 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 3) {
            if (y2 == x2 + 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 2) {
            if (y2 == x2 + 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == x1 + 1) {
            if (y2 == x2 + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        if (y1 == -x1 + 8) {
            if (y2 == -x2 + 8) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 7) {
            if (y2 == -x2 + 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 6) {
            if (y2 == -x2 + 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 5) {
            if (y2 == -x2 + 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 4) {
            if (y2 == -x2 + 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 3) {
            if (y2 == -x2 + 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 2) {
            if (y2 == -x2 + 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if (y1 == -x1 + 1) {
            if (y2 == -x2 + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
    }
}