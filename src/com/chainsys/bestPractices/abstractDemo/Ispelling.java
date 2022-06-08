package com.chainsys.bestPractices.abstractDemo;

public interface Ispelling {

    void spellCheck(String word);    //must be implemented by all languages 
   void checkGrammar(String sentence);    // must be implemented by all languages 
   int wordCount(String senetence);    // the logic is the same for all language
    
}
abstract class Language implements Ispelling{

    @Override
    public int wordCount(String senetence) {
        String [] words =senetence.split(" ");
        return 0;
    }
    
}
class EnglishLanguage extends Language implements Ispelling{

    @Override
    public void spellCheck(String word) {
        System.out.println("English Spellchecker");
    }

    @Override
    public void checkGrammar(String sentence) {
        System.out.println("English GrammarChecker");
    }

    class FrenchLanguage extends Language implements Ispelling{

        @Override
        public void spellCheck(String word) {
            System.out.println("French Spellchecker");
        }

        @Override
        public void checkGrammar(String sentence) {
            System.out.println("French GrammarChecker");
        }
}
    }