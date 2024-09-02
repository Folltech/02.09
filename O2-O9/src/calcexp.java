public class calcexp {
    public final float PI = 3.14F;
    public final float E = 2.7F;

    public int mins(int a, int b) {
        ;
        int min = 0;
        if (a > b) {
            min = b;
        } else if (b > a) {
            min = a;
        }
        return min;
    }

    public double arcsin(double a, double b) {
        double sum = a;
        double term = a;
        if (a < -1 || a > 1) {
            System.out.println("Недопустимое значение x. Оно должно быть в диапазоне от -1 до 1.");
            sum = 0;
        }
        else {
            for (int n = 1; n < b; n++) {
                term *= (2.0 * n - 1) * a * a / (2.0 * n);
                sum += term / (2.0 * n + 1);
            }
        }
            return sum;
    }
    public double arccos(double a, double b){
        double sum = a; // Первый член ряда
        double term = a; // Текущий член ряда
        if (a < -1 || a > 1) {
            System.out.println("Недопустимое значение x. Оно должно быть в диапазоне от -1 до 1.");
            sum = 0;
        }
        else {
            for (int n = 1; n < b; n++) {
                term *= (2.0 * n - 1) * a * a / (2.0 * n);
                sum += term / (2.0 * n + 1);
            }
            sum = PI/2 - sum;
        }

        return sum;
    }
    public double arctan(double a, double b){
        double sum = 0.0;
        double term = a;
        double xSquared = a * a;

        for (int n = 0; n < b; n++) {
            if (n % 2 == 0) {
                sum += term / (2 * n + 1);
            } else {
                sum -= term / (2 * n + 1);
            }
            term *= xSquared;
        }
        return sum;
    }
    public int step(int a, int b){
        int sum = a;
        for (int i = 0; i < b; i++){
            sum *= a;
        }
        return sum;
    }
}