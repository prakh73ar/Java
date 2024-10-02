public class J88Parameconstr {
    String message;
    J88Parameconstr(String message){
        this.message =message;
    }
    void display(){
        System.out.println(message);
    }
    public static void main(String[] args) {
        J88Parameconstr ob= new J88Parameconstr("hello world");
        ob.display();
    }
}
