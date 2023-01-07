package solution;

public class sol {
    public static double expr(String expression) {
        double res = 0;
        double b = 0;
        StringBuilder st = new StringBuilder();
        int i = 0;
        for (int k = 0; k < expression.length(); ++k) {
            st = new StringBuilder("");
            while (expression.charAt(i) != '+' && expression.charAt(i) != '-') {
                st.append(expression.charAt(i));
                ++i;
                if (i > expression.length() - 1) {
                    break;
                }
            }

            k =i++;
            res += Double.parseDouble(st.toString());
        }
        return res;
    }
}
