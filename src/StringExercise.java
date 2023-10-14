public class StringExercise {
    public static void main(String[] args) {
        stringChanger("I like Java!!!");
    }
    public static void stringChanger(String word) {
        System.out.println(word.substring(word.length()-1));

        if(word.endsWith("!!!") && word.startsWith("I like") && word.contains("Java")) {
            System.out.println(word.indexOf('J'));
                }

        System.out.println(word.replaceAll("a", "o"));

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        String[] words = word.split(" ");
        System.out.println(words[words.length-1]);
            }
        }

