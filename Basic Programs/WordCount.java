import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount{

    public static String readFile(String FileName) throws Exception {

        BufferedReader file = new BufferedReader(new FileReader(FileName));
        StringBuffer lines = new StringBuffer("");    
        String line;

        while ((line = file.readLine()) != null){
            
            lines = lines.append(line + "\n");

        }
        lines.deleteCharAt(lines.length()-1);
        file.close();
        return lines.toString();
    }

    public static int lineCounter(String characters){
    
        String[] lines = characters.split("\n");
        return lines.length;
    }


    public static int wordCounter(String characters){

        String[] words = characters.replaceAll("\n", " ").split(" ");
        return words.length;
    }


    public static void main (String[] args)throws Exception{

        String characters = null;

        for (int i = args.length-1; i>=0; i--){

            switch (args[i]) {
                case "m":
                    System.out.println("Character Count = " + characters.length());
                continue;

                case "w":
                    System.out.println("Word Count = " + wordCounter(characters));
                continue;

                case "l":
                    System.out.println("Line Count = " + lineCounter(characters));
                continue;
            
                default:
                    characters = readFile(args[i]);  
                continue;
            }
            
        }
        

    };
}