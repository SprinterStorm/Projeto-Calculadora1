public class Calculate {

   public static void main(String[] args) {
       int x = Integer.parseInt(args[1]);
       int y = Integer.parseInt(args[2]);

       if (args[0].equals("somar")){
           sum(x, y);
       }
       else if (args[0].equals("diminuir")) {
           minus(x, y);
       }
       else if (args[0].equals("multiplicar")) {
           multi(x, y);
       }
       else if (args[0].equals("dividir")) {
           share (x, y);
           }

   }

       static void sum (int x, int y){
           System.out.println(x + y);
       }

       static void minus (int x, int y){
           System.out.println(x - y);
       }

       static void multi (int x, int y){
           System.out.println(x * y);
       }

       static void share (int x, int y){
           System.out.println(x / y);
       }
   }