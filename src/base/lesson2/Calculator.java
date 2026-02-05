package base.lesson2;

public class Calculator {
    //Sum
    public static int sum(int x, int y){
        return  x + y;
    }
    public static long sum(int x, long y){
        return x + y;
    }
    public static double sum(int x, double y){
        return  x + y;
    }
    public static long sum(long x, long y){
        return x + y;
    }
    public static long sum(long x, int y){
        return x + y;
    }
    public static double sum(long x, double y){
        return x + y;
    }
    public static double sum(double x, double y){
        return x + y;
    }
    public static double sum(double x, int y){
        return x + y;
    }
    public static double sum(double x, long y){
        return x + y;
    }

    //Multiplication
    public static long mul(int x, int y){
        return (long) x * y;
    }
    public static long mul(int x, long y){
        return x * y;
    }
    public static double mul(int x, double y){
        return  Math.round(x * y * 100.0) / 100.0;
    }
    public static long mul(long x, long y){
        return x * y;
    }
    public static long mul(long x, int y){
        return x * y;
    }
    public static double mul(long x, double y){
        return Math.round(x * y * 100.0) / 100.0;
    }
    public static double mul(double x, double y){
        return Math.round(x * y * 100.0) / 100.0;
    }
    public static double mul(double x, int y){
        return Math.round(x * y * 100.0) / 100.0;
    }
    public static double mul(double x, long y){
        return Math.round(x * y * 100.0) / 100.0;
    }

    //Subtraction
    public static int sub(int x, int y){
        return  x - y;
    }
    public static long sub(int x, long y){
        return x - y;
    }
    public static double sub(int x, double y){
        return  x - y;
    }
    public static long sub(long x, long y){
        return x - y;
    }
    public static long sub(long x, int y){
        return x - y;
    }
    public static double sub(long x, double y){
        return x - y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double sub(double x, int y){
        return x - y;
    }
    public static double sub(double x, long y){
        return x - y;
    }

    //Division
    public static double div(int x, int y){
        return Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(int x, long y){
        return Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(int x, double y){
        return  Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(long x, long y){
        return Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(long x, int y){
        return Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(long x, double y){
        return Math.round(((double)x / y) * 100.0) / 100.0;
    }
    public static double div(double x, double y){
        return Math.round((x / y) * 100.0) / 100.0;
    }
    public static double div(double x, int y){
        return Math.round((x / y) * 100.0) / 100.0;
    }
    public static double div(double x, long y){
        return Math.round((x / y) * 100.0) / 100.0;
    }
}
