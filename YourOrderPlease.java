/*

Your order, please
Task: Sort a given string. Each word in the String will contain a single number. This number is the position the word should
have in the result. 

Note: Numbers can be from 1 to 9. So 1 will be hte first word(not 0). 

If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers. 

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"



*/ 


/**

This class will complete task "your order, please"
  

*/ 
public class Order {
private static int maxWords = 9 ; 


/*
This method will instantiate an array with 9 elements. 
Depending on if a number is found in the word, the word will be placed 
in that index of the array - 1. 
*/ 
  public static String[] sortWordOrder(String word)
  {
      String[] wordListSorted = new String[maxWords] ;
      String[] unsortedWordList = word.split(" "); 
      for( String wordElement : unsortedWordList ) 
      {
         if(wordElement.contains("1"))
         {
            wordListSorted[0] = wordElement; 
         }
         else if (wordElement.contains("2"))
         {
            wordListSorted[1] = wordElement; 
         }
         else if (wordElement.contains("3"))
         {
            wordListSorted[2] = wordElement; 
         }
         else if (wordElement.contains("4"))
         {
            wordListSorted[3] = wordElement; 
         }
         else if (wordElement.contains("5"))
         {
            wordListSorted[4] = wordElement; 
         }
         else if (wordElement.contains("6"))
         {
            wordListSorted[5] = wordElement; 
         }
         else if (wordElement.contains("7"))
         {
            wordListSorted[6] = wordElement; 
         }
         else if (wordElement.contains("8"))
         {
            wordListSorted[7] = wordElement; 
         }
         else if (wordElement.contains("9"))
         {
            wordListSorted[8] = wordElement; 
         }
         

      }
      
      return wordListSorted; 
      
      
      
  }
  
  /**
  This method will construct the string in order of digits found in the array. 
  Also this method will trim the space at the end of the sentence. 
  @return String
  */ 
  public static String printArray(String[] stringArray)
  {
  
     String parsedWord = ""; 
     
     if(stringArray[0] != null)
     {
         for(String arrayElement : stringArray)
         {
            if(arrayElement != null) 
            {
              parsedWord += arrayElement +" ";
            }
         
         }
         parsedWord = parsedWord.substring(0,parsedWord.length()-1); 
     }
     
     return parsedWord; 
  
  }
  


  public static String order(String words) {
    // ...
    

  String[] wordArray =  sortWordOrder( words ); 
  return printArray(wordArray); 
    
  }
}