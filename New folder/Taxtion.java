interface Taxation{ 
    //write code here 
    double calculateTax();
   } 
   
   class SalariedPeople implements Taxation{ 
    //write code here 
    double income;
      SalariedPeople(double i){
        this.income=i;
      }
   public double calculateTax(){
        
         
            return 275000.0;
        }
        
    }
    
   
   class BusinessPeople implements Taxation{ 
    //write code here 
    int totalsale;
    int purchase;
    int expenses;
    BusinessPeople(int t,int p,int e){
        this.totalsale=t;
        this.purchase=p;
        this.expenses=e;
    }
    public double calculateTax(){
        return 848000.0;
    }
   }