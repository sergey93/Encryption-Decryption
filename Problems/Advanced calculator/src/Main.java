/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        int res = 0;
        if (operator.compareTo("MAX") == 0) {
            res = Integer.parseInt(args[1]);
            for (int i = 2; i < args.length; i++) {
                int el = Integer.parseInt(args[i]);
                res = (res < el) ? el : res;
            }
        }
        if (operator.compareTo("MIN") == 0) {
            res = Integer.parseInt(args[1]);
            for (int i = 2; i < args.length; i++) {
                int el = Integer.parseInt(args[i]);
                res = (res > el) ? el : res;
            }
        }
        if (operator.compareTo("SUM") == 0) {
            for (int i = 1; i < args.length; i++) {
                int el = Integer.parseInt(args[i]);
                res += el;
            }
        }
        System.out.println(res);
    }
}