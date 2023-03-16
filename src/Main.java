public class Main {
    public static void main(String[] args) {
        String words = "One Two Three Four Five Six Seven Eight Nine Ten" ;
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
