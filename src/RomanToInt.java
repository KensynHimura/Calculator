public class RomanToInt {

    String [] romeNum = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    int count = 0;
    int result;
    int arabic1;
    int arabic2;
    Calcy calcy = new Calcy();
    Rome rome = new Rome();

    public void swither(String x, char sum, String y) {

        for (String s : romeNum) {
            if (x.toUpperCase().equals(s)) {
                x = x.toUpperCase();
                count++;
            }
            if (y.toUpperCase().equals(s)) {
                y = y.toUpperCase();
                count++;
            }
        }
        switch (count) {
            case 0:
                arabic1 = Integer.parseInt(x);
                arabic2 = Integer.parseInt(y);
                System.out.println(calcy.calcy(arabic1, sum, arabic2));
                break;

            case 1:
                throw new NumberFormatException("Используйте цифры одного типа.");

            case 2:

                arabic1 = rome.convertRomeToArab(x);
                arabic2 = rome.convertRomeToArab(y);
                result = calcy.calcy(arabic1, sum, arabic2);
                if (result > 0) {
                    System.out.println(rome.convertArabToRome(result - 2));
                } else {
                    throw new ArithmeticException ("Результат отрицательный.");
                }
        }
    }
}