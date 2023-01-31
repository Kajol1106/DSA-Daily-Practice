abstract class admissionProcess{
    public abstract  boolean ageLimit(int age);
    public abstract  boolean educationCriteria(boolean plusTwo);
     public abstract boolean creditScore(int score);
    public abstract  boolean nationality(String citizen);
     // write the abstract class as mentioned in the problem statement above
   }
   
   class intensiveProgram extends admissionProcess{
      int age;
      boolean plusTwo;
      int creditScore;
      String citizen;
      
     public intensiveProgram(int age, boolean plusTwo,String citizen, int creditScore ){
          this.age=age;
          this.plusTwo=plusTwo;
           this.citizen=citizen;
          this.creditScore=creditScore;
         
          
      }
      
      public intensiveProgram(int age, boolean plusTwo, String citizen){
           this.age=age;
          this.plusTwo=plusTwo;
          this.creditScore=750;
          this.citizen=citizen;
          
      }
      
      
      public boolean ageLimit(int age){
           if(age>18&&age<28){
               return true;
           }else{
               return false;
           }
       };
       
     public   boolean educationCriteria(boolean plusTwo){
           if(plusTwo){
               return true;
           }
           return false;
       }
      public   boolean creditScore(int score){
            if(score>=750)
            return true;
            else
            return false;
        }
        public  boolean nationality(String citizen){
             if(citizen.equals("Indian")){
                 return true;
             }
             return false;
         }
         
       
       public String finalDecision(){
            if(ageLimit(age)&&educationCriteria(plusTwo)&&creditScore(creditScore)&&nationality(citizen)){
                
                return "You are eligible for the Intensive Program";
            }
            else{
            return "You are not eligible for the Intensive Program";
            }
        }
     // write the class as mentioned in the problem statement above
   }
   
   class xProgram extends admissionProcess{
       
            int age;
           boolean plusTwo;
           int creditScore;
           String citizen;
           int yearsOfExperience;
           
            xProgram(int age, boolean plusTwo,String citizen, int creditScore,int yearsOfExperience ){
          this.age=age;
          this.plusTwo=plusTwo;
          this.creditScore=creditScore;
          this.citizen=citizen;
          this.yearsOfExperience=yearsOfExperience;
          
      }
      
      xProgram(int age, boolean plusTwo, String citizen, int yearsOfExperience){
          
          this.age=age;
          this.plusTwo=plusTwo;
          this.creditScore=750;
          this.citizen=citizen;
          this.yearsOfExperience=yearsOfExperience;
      }
         
      
      
      
       public boolean ageLimit(int age){
           if(age>18&&age<35){
               return true;
           }else{
               return false;
           }
       };
       
      public  boolean educationCriteria(boolean plusTwo){
           if(plusTwo){
               return true;
           }
           return false;
       }
       public  boolean creditScore(int score){
            if(score>=750)
            return true;
            else
            return false;
        }
         public boolean nationality(String citizen){
             if(citizen.equals("Indian")||citizen.equals("American")){
                 return true;
             }
             return false;
         }
         public boolean experience(){
             if(yearsOfExperience>=2){
                 return true;
             }
             return false;
         }
        public String finalDecision(){
            if(ageLimit(age)&&educationCriteria(plusTwo)&&creditScore(creditScore)&&nationality(citizen)&&experience()){
                
                return "You are eligible for the X Program";
            }
            return "You are not eligible for the X Program";
            
        }
       
       
     // write the class as mentioned in the problem statement above
   }
   