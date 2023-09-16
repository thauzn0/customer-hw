public class Lab6{
  //this class counting spaces
  public static int countSpaces(String s){
  int counter = 0;
  char c = ' ';
 
  for(int i=0;s.length()>i;i++){
    if(s.charAt(i)==c){
    counter++;
    }
 
  }
  return counter;
  }
 
  //this class remove spaces
  public static String removeSpaces(String s){
 
StringBuilder builder = new StringBuilder();

for(int i = 0;i<s.length();i++){
  if(s.charAt(i)!=' '){
 
  builder.append(s.charAt(i));
  }


}
  return builder.toString();
  }
 
  //this class spriting string
  public static String everyNthChar(String s, int n){
 
  StringBuilder builder1 = new StringBuilder("");
  char c = ' ';
    if(n>0)
  for(int i=0;i<s.length();i+=n){
 
   
    if(s.charAt(i) + 1 != s.length()){
    builder1.append(s.charAt(i));
    } else{
    builder1.append(s.charAt(i));
    builder1.append(" ");
    }
   
  }  
  return builder1.toString();
  }
 
 
 
 
 
 
 
 
 
 
 
}
