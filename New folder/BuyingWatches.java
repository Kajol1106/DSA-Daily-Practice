class WatchPriceCalculator{ 
    String getWatchPrice(String watchType, int age, String gender){  
      //code to computer and return the price of watch up to two decimal  places 
       double bill=0;
       
       if(watchType=="Titan"){
           
          bill= 7999+ ((7999*12.5)/100) + ((7999*7.5)/100);
          if(age>=60 && gender=="female") {
              bill=bill-((bill*5)/100);
          }else if(age>=60) {
              bill=bill-((bill*3)/100);
          }else if(gender=="female"){
             bill=bill-((bill*2)/100);
          }
              
           
       }else if(watchType=="Rolex"){
          bill= 10999+ ((10999*13.5)/100) + ((10999*12.5)/100);
          if(age>=60 && gender=="female") {
              bill=bill-((bill*5)/100);
          }else if(age>=60) {
              bill=bill-((bill*3)/100);
          }else if(gender=="female"){
             bill=bill-((bill*2)/100);
          }
           
       }
       bill=(Math.round(bill*100))/100.0;
        
       return "The total bill amount is "+bill;
      
    }
    
   }