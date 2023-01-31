/*
interface Instructor{
    public String topic();
    public int evaluation();
    public boolean constructWeek();
    public String instructorName(String a);
}
*/
class dsa implements Instructor{
    public String topic(){
        return "Data Structures & Algorithms";
    }
    public int evaluation(){
        return 2;
    }
    
    public boolean constructWeek(){
        return false;
    }
    public String instructorName(String a){
        
        if(a.equals("DSA101")){
            return "Varun Bhatt";
        }
        
        if(a.equals("DSA201")){
            return "Venugopal Panchamurthi";
        }
        
        if(a.equals("DSA301")){
            
            return "Aishwarya Shivachandran";
        }
        
        if(a.equals("DSA401")){
            
            return "Akshay Gupta";
        }
        return null;
    }
    //implement all the functions inherited by this class as mentioned in the problem statement
}

class coding implements Instructor{
    // implement all the functions inherited by this class as mentioned in the problem statement
    public String topic(){
        return "Java & Spring boot";
    }
    public int evaluation(){
        return 3;
    }
    
    public boolean constructWeek(){
        return true;
    }
    public String instructorName(String a){
        if(a.equals("JA111")){
            return "Ratan Lal Gupta";
        }
        
        if(a.equals("SB101")){
            
            return "Arjun Thakur";
        }
        
        if(a.equals("SB201")){
            
            return "Ratan Lal Gupta";
        }
         if(a.equals("RJ101")){
            
            return "Varun Bhatt";
        }
        return null;
    }
    
}
