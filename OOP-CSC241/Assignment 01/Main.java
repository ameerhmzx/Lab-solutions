import java.util.Random;
import java.util.Scanner;

enum WordDirection {Horizontal, Vertical, Diagonal}

class Main {
    public static void main(String[] args) {
        CountLettersInArray game = new CountLettersInArray();
        char[] words = game.wordGame();
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%c  ",words[i]);
            if ((i+1) % 12 == 0) System.out.println("");
        }
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

class CountLettersInArray {

    private char[] arr;
    private int[] count;

    char[] createArray(int size) {
        arr = new char[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomCharacter.getRandomLowerCase();
        }
        return arr;
    }

    void displayCharacterArray() {
        for (char a : arr) {
            System.out.print(a + ", ");
        }
    }

    void displayCountsArray() {
        for (int a : count) {
            System.out.print(a + ", ");
        }
    }

    int[] countCharacters(char[] ch) {
        count = new int[26];
        for (int i = 0; i < 26; i++) {
            for (char a : ch) {
                if (ch[i] == a)
                    count[i]++;
            }
        }
        return count;
    }

    private String getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter any word: ");
        return scanner.next();
    }

    private WordDirection getWordDirection() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("In which direct you wanna insert the word:\n" +
                "1: Horizontal\n" +
                "2: Vertical\n" +
                "3: Diagonal\n" +
                "(Horizontal) > ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 2:
                return WordDirection.Vertical;
            case 3:
                return WordDirection.Diagonal;
            // The default direction
            default:
                return WordDirection.Horizontal;
        }
    }

    private int getRandomStartIndex(int wordSize, int arraySize) {
        Random rand = new Random();
        int upperBound = 12 - wordSize;
        int yIndex = rand.nextInt(upperBound);
        int xIndex = rand.nextInt(upperBound);

        return yIndex * 12 + xIndex;
    }

    private void insertWordOnBoard(char[] gameBoard, String word, WordDirection direction, int startIndex) {
        while (!word.isEmpty()) {
            gameBoard[startIndex] = word.charAt(0);
            word = word.substring(1);

            switch (direction) {
                case Horizontal:
                    startIndex += 1;
                    break;
                case Vertical:
                    startIndex += 12;
                    break;
                case Diagonal:
                    startIndex += 13;
                    break;
            }
        }
    }

    char[] wordGame() {
        String word = getWordFromUser();
        WordDirection direction = getWordDirection();

        // make board proper square
        int arraySize = 12 * 12;
        int startIndex = getRandomStartIndex(word.length(), arraySize);

        char[] gameBoard = createArray(arraySize);
        insertWordOnBoard(gameBoard, word, direction, startIndex);
        return gameBoard;
    }
}
