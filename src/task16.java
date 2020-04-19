//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
import java.io.*;

public class task16{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("D:\\new 31.txt");  //тут нужно прописать путь файла
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File "+f.getName()+"? yes/no"); //хотим тз файла прочесть данные или нет
        name = br.readLine();
        if(name.equals("yes"))
            while ((line = fin.readLine()) != null) System.out.println(line);
    }
}