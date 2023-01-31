/*
abstract class sports{
    abstract boolean indoor();
    abstract boolean multiplayer();
    abstract boolean teamSport();
    abstract boolean olympicSport();
    abstract int teamSize();
}
*/
class cricket extends sports{
    // complete the class as mentioned in the problem statement
    public boolean indoor(){
        return false;
    };
    public boolean multiplayer(){
        return true;
    };
    public boolean teamSport(){
        return true;
    };
    public boolean olympicSport(){
        return false;
    };
    public int teamSize(){
        return 11;
    };
    
    public boolean worldCup(){
       return true; 
    }
}

class tennis extends sports{
    
    public boolean indoor(){
        return false;
    };
    public boolean multiplayer(){
        return true;
    };
    public boolean teamSport(){
        return true;
    };
    public boolean olympicSport(){
        return true;
    };
    public int teamSize(){
        return 1;
    };
    
   public  boolean grandSlam(){
        return true;
    }
    // complete the class as mentioned in the problem statement
}

class football extends sports{
    
    public int numberOfTeams(){
        return 32;
    }
    
    public boolean indoor(){
        return false;
    };
    public boolean multiplayer(){
        return true;
    };
    public boolean teamSport(){
        return true;
    };
    public boolean olympicSport(){
        return true;
    };
    public int teamSize(){
        return 11;
    };
    
    public boolean worldCup(){
       return false; 
    }
    // complete the class as mentioned in the problem statement
}
