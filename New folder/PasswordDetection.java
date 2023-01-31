/*
abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}
*/
class checker extends passwordDetector{
    // complete the class as mentioned in the problem statement
    int size;
    
    public checker(int s){
        this.size=s;
    }
    
    boolean checkLength(String password){
        
        if(password.length()>=size){
            
            return true;
        }else{
            
            return false;
        }
        
    }
    
    boolean checkSpecialCharacter(String password){
        int c=0;
        for(int i=0;i<password.length();i++){
            
            if(password.charAt(i)=='@'||
            password.charAt(i)=='#'||
            password.charAt(i)=='$'||
            password.charAt(i)=='&'||password.charAt(i)=='*'){
                c++;
            }
            
        }
        if(c==0){
            return false;
        }else{
            return true;
        }
        
    }
    
    boolean checkNumber(String password){
        
         int c=0;
        for(int i=0;i<password.length();i++){
            
            if(password.charAt(i)=='0'||
            password.charAt(i)=='1'||
            password.charAt(i)=='2'||
            password.charAt(i)=='3'||
            password.charAt(i)=='4'||
            password.charAt(i)=='5'||
            password.charAt(i)=='6'||
            password.charAt(i)=='7'||
            password.charAt(i)=='8'||
            password.charAt(i)=='9'
            ){
                c++;
            }
            
        }
        if(c==0){
            return false;
        }else{
            return true;
        }
        
    }
    
    boolean checkUpperCase(String password){
        
         int c=0;
        for(int i=0;i<password.length();i++){
            
            if(password.charAt(i)>=65&&password.charAt(i)<=90
            ){
                c++;
            }
            
        }
        if(c==0){
            return false;
        }else{
            return true;
        }
        
    }
    
    boolean checkLowerCase(String password){
        
         int c=0;
        for(int i=0;i<password.length();i++){
            
            if(password.charAt(i)>=97&&password.charAt(i)<=122
            ){
                c++;
            }
            
        }
        if(c==0){
            return false;
        }else{
            return true;
        }
    }
    
  }
