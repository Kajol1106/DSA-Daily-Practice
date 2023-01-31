class stack{
    int top;
    int size;
    int[] arr;
    
    stack(int size){
        
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    
    boolean push(int data){
        
        if(top<arr.length){
            
        arr[top+1]=data;
        top++;
        return true;
        }
        return false;
    }
    
    boolean pop(){
        
        if(arr.length>0){
            
            System.out.println(arr[top]);
            top--;
             //size--;
            return true;
        }
       return false; 
    }
    
    boolean peek(){
        
        if(arr.length>0){
            
            System.out.println(arr[top]);
             
            return true;
        }
        return false;
    }
    
    int size(){
        
        return top+1;
    }
 }
