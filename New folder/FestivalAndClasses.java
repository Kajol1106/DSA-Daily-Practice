/*
abstract class festival{
    abstract boolean winter();
    abstract boolean summer();
    abstract boolean multidays();
    abstract boolean panIndia();
}
*/
class diwali extends festival{
    // complete the class as mentioned in the problem statement
    public boolean winter(){
        return true;
    };
    public boolean summer(){
        return false;
    };
    public boolean multidays(){
        return true;
    };
    public boolean panIndia(){
        return true;
    };
    public boolean festivalOfLights(){
        return true;
    }; 
}

class holi extends festival{
    // complete the class as mentioned in the problem statement
   public boolean winter(){
        return false;
    };
    public boolean summer(){
        return true;
    };
    public boolean multidays(){
        return false;
    };
    public boolean panIndia(){
        return true;
    };
    public boolean festivalOfColors(){
        return true;
    }; 
}

class pongal extends festival{
    
    public boolean winter(){
        return true;
    };
    public boolean summer(){
        return false;
    };
    public boolean multidays(){
        return false;
    };
    public boolean panIndia(){
        return true;
    };
    // complete the class as mentioned in the problem statement above
}
