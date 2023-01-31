public static void masaiPalindromicSubstring(String str){
    //write your code here
    
    int max=0;
    
    for(int i=0;i<str.length();i++){
        String bag="";
        for(int j=i;j<str.length();j++){
            bag+=str.charAt(j);
            if(fun(bag)){
                if(bag.length()>max){
                    max=bag.length();
                }
            }
        }
    }
    
    System.out.println(max);
    
    
  }
  
  public static boolean fun(String str){
      String bag="";
      
      for(int i=str.length()-1;i>=0;i--){
          bag+=str.charAt(i);
      }
      
      if(bag.equals(str)){
          return true;
      }else{
          return false;
      }
  }
