class strClassOne implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
      String bag=a+" "+b;
        return bag;
        // This function prints both the strings on the same line separated by space
    }
    public int countVowels(String a,String b){
             int av=0;
      int bv=0;
      a=a.toLowerCase();
      b=b.toLowerCase();
       for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              av++;
          } 
          }
            for(int i=0;i<b.length();i++){
          if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
              bv++;
          } 
          }
          if(av>bv){
              return b.length();
          }
          if(bv>av){
               return a.length();
          }
          else{
              if(a.length()>b.length()){
                  return a.length();
              }else{
                   return b.length();
              }
        
       // This function returns the length of the string having lesser number of vowels. 
      //In case both the strings, have the same number of vowels return the length of the bigger string
    }
    }
      public int countConsonants(String a,String b){
                    int v=0;
             int v1=0;
      int ac=0;
      int bc=0;
       a=a.toLowerCase();
      b=b.toLowerCase();
       for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              v++;
          }else{
              ac++;
          }
          }
          
              for(int i=0;i<b.length();i++){
          if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
              v1++;
          }else{
              bc++;
          }
          }
          
            if(ac>bc){
              return b.length();
          }
          if(bc>ac){
               return a.length();
          }
          else{
              if(a.length()>b.length()){
                  return a.length();
              }else{
                   return b.length();
              }
          
         // This function returns the length of the string having lesser number of consonants
         // In case both the strings have the same number of consonants, return the length of the bigger string
      }
  }
  }
  class strClassTwo implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
          String s=a+'\n'+b;
          return s;
        // This functions prints string a and string b on two different lines
    }
    public int countVowels(String a,String b){
                int av=0;
      int bv=0;
       a=a.toLowerCase();
      b=b.toLowerCase();
       for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              av++;
          } 
          }
            for(int i=0;i<b.length();i++){
          if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
              bv++;
          } 
          }
          if(av>bv){
              return a.length();
          }
          if(bv>av){
               return b.length();
          }
          else{
              if(a.length()>b.length()){
                  return b.length();
              }else{
                   return a.length();
              }
        
      
    }
         // This function returns the length of the string having more number of vowels. 
        //In case both the strings, have the same number of vowels return the length of the smaller string
    }
      public int countConsonants(String a,String b){
          
                       int v=0;
             int v1=0;
      int ac=0;
      int bc=0;
       a=a.toLowerCase();
      b=b.toLowerCase();
       for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              v++;
          }else{
              ac++;
          }
          }
          
              for(int i=0;i<b.length();i++){
          if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
              v1++;
          }else{
              bc++;
          }
          }
          
            if(ac>bc){
              return a.length();
          }
          if(bc>ac){
               return b.length();
          }
          else{
              if(a.length()>b.length()){
                  return b.length();
              }else{
                   return a.length();
              }
          
         
      }
         // This function returns the length of the string having more number of consonants
         // In case both the strings have the same number of consonants, return the length of the smaller string
      }
  }