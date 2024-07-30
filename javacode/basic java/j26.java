public class j26 {
    public static void main(String[] args) {
        String name = "prakhar";
        System.out.println(name.substring(3));
        System.out.println(name.substring(0));
        System.out.println(name.substring(1, 5));
        System.out.println("\n");

        System.out.println(name.replace('r', 's'));
        System.out.println(name.replace("r", "es"));
        System.out.println("\n");

        System.out.println(name.startsWith("pr"));
        System.out.println(name.startsWith("r"));
        System.out.println("\n");

        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("a"));
        System.out.println("\n");

        System.out.println(name.charAt(2));
        System.out.println("\n");

        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("ar"));
        System.out.println(name.indexOf("ra"));
        System.out.println(name.indexOf("ar", 2));
        System.err.println("\n");

        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("rr"));
        System.err.println("\n");

        System.out.println(name.lastIndexOf("r", 2));
        System.err.println("\n");

        System.out.println(name.equals("prakhar"));
        System.out.println(name.equals("prakh"));
        System.out.println(name.equals("Prakhar"));
        System.err.println("\n");

        System.out.println(name.equalsIgnoreCase("prakhar"));
        System.out.println(name.equalsIgnoreCase("Prakhar"));
        System.err.println("\n");
        
        System.out.println("the \\ \" the ");
    }
}