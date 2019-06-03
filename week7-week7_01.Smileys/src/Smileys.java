
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
 
        if (characterString.length() % 2 == 1){
            characterString += " ";
        }
        
        characterString = " " + characterString + " ";
        
        int length = characterString.length();
        
        printSmileyLine(length / 2 + 2);
        printLine(characterString);
        printSmileyLine(length / 2 + 2);
    }
    
    private static void printSmileyLine(int length){
        String line = "";
        
        for (int i = 0; i < length; i++){
            line += ":)";
        }
        
        System.out.println(line);
        //System.out.println(line.length());
    }
    
    private static void printLine(String line){
        System.out.println(":)" + line + ":)");
        
    }
    

}
