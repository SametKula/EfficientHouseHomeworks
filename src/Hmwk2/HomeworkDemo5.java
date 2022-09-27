package Hmwk2;

public class HomeworkDemo5 {
    public static void main(String[] args) {
        //paragraph
        String str1= "I hate everything , I hate purple, I hate tarhana soup, I hate etliekmek";
        //replace words
        String word1 = "hate" , word2 = "love";
        System.out.printf("Please enter two words you want to change between%ninput type is (paragraph,word one,word two)%n>>>\"%s\",%s,%s%n",str1,word1,word2);
        //replace field
        str1 = str1.replaceAll(word1,word2);
        //result
        System.out.println(str1);
        //system out is
        /*Please enter two words you want to change between
        input type is (paragraph,word one,word two)
        >>>"I hate everything , I hate purple, I hate tarhana soup, I hate etliekmek",hate,love
        I love everything , I love purple, I love tarhana soup, I love etliekmek*/
    }
}
