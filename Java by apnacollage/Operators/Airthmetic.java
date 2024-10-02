public class Airthmetic {

    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("add = " + (a+b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println("unary pre");
        int c=5;
        int d=++c;
        System.out.println(c);
        System.out.println(d);
        
        System.out.println("unary post");
        int e=5;
        int f=e++;
        System.out.println(e);
        System.out.println(f);
    }
}