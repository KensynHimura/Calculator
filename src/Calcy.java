public class Calcy {
    public static int calcy(int x, char sum, int y) {

        int result = 0;

        if (x > 0 & x < 11 & y > 0 & y < 11) {
            if (sum == '+') {
                result = x + y;
            }
            if (sum == '-') {
                result = x - y;
            }
            if (sum == '*') {
                result = x * y;
            }
            if (sum == '/') {
                result = x / y;
            }
        } else {
            throw new WrongNumberException("Не верное число.");
        }
        System.out.print("Ваш ответ: ");
        return result;
    }
}
