    import java.util.Scanner;
    public class tassk4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ввести число в бинарном формате: ");
            String bin = sc.nextLine();
          int binNum = Integer.parseInt(bin, 2); //записываем в инт в двоичном формате

            System.out.println(binNum);
        }

    }