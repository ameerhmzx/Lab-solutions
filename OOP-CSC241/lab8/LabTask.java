class LabTask {
  public static void main(String[] args) {
    System.out.println(RandomCharacter.getRandomLowerCase());
  }
}

class RandomCharacter {
  public static char getRandomCharacter() {
    return (char) (Math.random() * 65536);
  }

  public static char getRandomCharacter(char min, char max) {
    return (char) (Math.random() * (max - min + 1) + min);
  }

  public static char getRandomLowerCase() {
    return getRandomCharacter('a', 'z');
  }

  public static char getRandomUpperCase() {
    return getRandomCharacter('A', 'Z');
  }

  public static char getRandomDigit() {
    return getRandomCharacter('0', '9');
  }
}

class CountLettersInArray{

    private char[] arr;
    private int[] count;
   
    char[] createArray(){
        arr = new char[100];
        return arr;
    }
    
    void displayCharacterArray(){
        for(char a : arr){
            System.out.print(a+", ");
        }
    }
    
    void displayCountsArray(){
        for(int a : count){
            System.out.print(a+", ");
        }
    }
    
    int[] countCharacters(char[] ch){
        count = new int[26];
        for(int i = 0; i<26; i++){
            for(char a : ch){
               if(ch[i] == a)
                   count[i]++;
            }
        }
        return count;
    }
    
}
