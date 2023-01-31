class coffee{
    boolean hot;
    boolean creamy;
    boolean chocolateSauce;
    boolean milk;
    boolean high_water_pressure;
    
    public coffee(boolean h,boolean c,boolean ch,boolean m,boolean hi){
        this.hot=h;
        this.creamy=c;
        this.chocolateSauce=ch;
        this.milk=m;
        this.high_water_pressure=hi;
    }
   
   boolean mocha(){
       
       if(hot==true&&creamy==true&&chocolateSauce==false&&milk==true&&high_water_pressure==true){
           return true;
       }else{
           return false;
       }
       
   }
   
   boolean latte(){
       if(hot==true&&creamy==true&&chocolateSauce==true&&milk==true&&high_water_pressure==true){
           return true;
       }else{
           return false;
       }
       
   }
   boolean espresso(){
       if(hot==true&&creamy==false&&chocolateSauce==true&&milk==true&&high_water_pressure==false){
           return true;
       }else{
           return false;
       }
   }
   
   
   boolean frappuccino(){
       if(hot==false&&creamy==true&&chocolateSauce==true&&milk==true&&high_water_pressure==false){
           return true;
       }else{
           return false;
       }
       
   }
   
    
    // complete the class as mentioned in the problem statement
  }
  
