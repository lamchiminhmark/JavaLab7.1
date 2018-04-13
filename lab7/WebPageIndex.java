import java.util.*;
import java.io.*;

public class WebPageIndex {
   
   //TODO: Insert the instance variables here

   // WebPageIndex constructor
   WebPageIndex(String url) {
      // TODO - implement me! - add some comments too!
   }     
   
   // Returns a count of the words in this web page
   public int getWordCount() {
      // TODO - implement me! - add some comments too!
      return -1;
   }
   
   public String getUrl() {
      // TODO - implement me! - add some comments too!
      return "";
   }
   
   public boolean contains(String s) {
      // TODO - implement me! - add some comments too!
      return false;
   }
   
   public int getCount(String s) {
      // TODO - implement me! - add some comments too!
      return -1;
   }
   
   public double getFrequency(String s) {
      // TODO - implement me! - add some comments too!
      return -1.0;
   }
   
   public List<Integer> getLocations(String s) {
      // TODO - implement me! - add some comments too!
      return null;
   }

   // return an Iterator over all the words in the index
   public Iterator<String> words() {
      // TODO - implement me! - add some comments too!
      return null;
   }
   
   public String toString() {
      // TODO - implement me! - add some comments too!
      return "";
   }

   // The main method is an application using a WebPageIndex
   public static void main(String[] args) throws IOException {
      // TODO - implement me! - add some comments too!
   }

   
   /* 
    * additional features to support multi-word phrases 
    * work on these after you have the previous methods working correctly
    */
   
   public boolean containsPhrase(String s) {
      // TODO - implement me! - add some comments too!
      return false;
   }
   
   public int getPhraseCount(String s) {
      // TODO - implement me! - add some comments too!
      return -1;
   }
   
   public double getPhraseFrequency(String s) {
      // TODO - implement me! - add some comments too!
      return -1.0;
   }

   public List<Integer> getPhraseLocations(String s) {
      // TODO - implement me! - add some comments too!
      return null;
   }
   
   
}
