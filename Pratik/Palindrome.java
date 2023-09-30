public class Palindrome {
    public static void main(String[] args) {
        if(palinCheck("tenet")){ // method call for check and writing answer on screen
            System.out.print("Your word is palindrome"); 
        }else{
            System.out.print("Your word isn't palindrome");
        }
    }

    public static boolean palinCheck(String str){
        int lenght = str.length(); // taking how long string is
        int halfLenght = lenght/2; // divide the half cuz of we were checking left half to right half
        for(int i = 0 ; i < halfLenght ; i++){ // for index number to use charAt()
            if(str.charAt(i) != str.charAt(lenght-(i+1))){ // taking char from left with i and right with lenght-i-1. (index starts wiht 0 so we have to subtract 1)
                return false; // if we find even 1 non equal its not palindrome
            }
        }
        return true; // if code doesnt return inside comparison if, its palindrome. 
    }
}
