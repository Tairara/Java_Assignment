package Question4;

public class Number4 {
 
        // main method
        public static void main(String[] args) {

            String sentence_one, sentence_two;
            // call a static method
            sentence_one = "What is";
            sentence_two = getSecondSentence();
    
            // using non-static method
            Number4 objOfThisClass = new Number4();
            objOfThisClass.combineWords(sentence_one, sentence_two);
        }

    //non static method
    void combineWords(String sentence_one, String sentence_two) {
        System.out.println(sentence_one + sentence_two);
    }

    // This is a static method
    static String getSecondSentence() {
        return " your name?";
    }


}