class Problem {
    public static void main(String[] args) {
        int index = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].compareTo("test") == 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}