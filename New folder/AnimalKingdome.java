/*
abstract class Animal{
  abstract boolean run();
  abstract boolean swim();
  abstract boolean crawl();
  abstract boolean fly();
}
*/
class Tiger extends Animal{
    boolean run(){
       return true; 
    }
    boolean swim(){
        return true;
    }
    
    boolean crawl(){
        return false;
    }
    boolean fly(){
        return false;
    }
  // declare and define all the functions that are inherited by this class
}

class Snake extends Animal{
    boolean run(){
       return false; 
    }
    boolean swim(){
        return false;
    }
    
    boolean crawl(){
        return true;
    }
    boolean fly(){
        return false;
    }
  // declare and define all the functions that are inherited by this class
}

class Eagle extends Animal{
    boolean run(){
       return false; 
    }
    boolean swim(){
        return false;
    }
    
    boolean crawl(){
        return false;
    }
    boolean fly(){
        return true;
    }
  // declare and define all the functions that are inherited by this class
}

class Shark extends Animal{
    boolean run(){
        return false;
    }
    boolean swim(){
        return true;
    }
    
    boolean crawl(){
        return false;
    }
    boolean fly(){
        return false;
    }
  // declare and define all the functions that are inherited by this class
}

