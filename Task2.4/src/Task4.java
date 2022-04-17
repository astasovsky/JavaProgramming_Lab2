public class Task4 {
    private static final double Epsilon = 0.0000001;

    public static void main(String[] args) {
        System.out.println("Нахождение корней уравнения x^3 - 3.5x^2 + 0.5x + 5 = 0");

        System.out.println("Методом Ньютона:");
        System.out.println(CalculateRootUsingNewtonMethod(0, Epsilon));
        System.out.println(CalculateRootUsingNewtonMethod(2.2, Epsilon));
        System.out.println(CalculateRootUsingNewtonMethod(10, Epsilon));

        System.out.println("Методом деления отрезка пополам:");
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(-10, 0, Epsilon));
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(0, 2.26, Epsilon));
        System.out.println(CalculateRootUsingDividingLineSegmentInHalfMethod(2.2, 10, Epsilon));
    }

    public static double Function(double x) {
        return x * x * x - 3.5 * x * x + 0.5 * x + 5;
    }

    public static double FunctionDerivative(double x) {
        return 3 * x * x - 7 * x + 0.5;
    }

    //Вычисление корня уравнения методом Ньютона с помощью рекурсивной функции
    public static double CalculateRootUsingNewtonMethod(double x, double e) {
        double xn = x - Function(x) / FunctionDerivative(x);

        if (Math.abs(xn - x) < e) {
            return xn;
        }
        return CalculateRootUsingNewtonMethod(xn, e);
    }

    //Вычисление корня уравнения методом деления отрезка пополам с помощью рекурсивной функции
    public static double CalculateRootUsingDividingLineSegmentInHalfMethod(double a, double b, double e) {
        double c = (a + b) / 2;
        if (b - a <= e) return c;

        if (Function(a) * Function(c) < 0) return CalculateRootUsingDividingLineSegmentInHalfMethod(a, c, e);
        else if (Function(a) * Function(c) > 0) return CalculateRootUsingDividingLineSegmentInHalfMethod(c, b, e);
        else return c;
    }
}
