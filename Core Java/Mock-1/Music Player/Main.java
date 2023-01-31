class song{
    // complete the class as mentioned in the description above
    int length;
    String language;
    int index;
    
    public song(int l, int i, String lang) {
        this.index = l;
        this.language = lang;
        this.length = i;
    }
    
    int length() {
        return length;
    }
    
    String language() {
        return language;
    }
    
    String category() {
        if(index==1) {
            return "Classical";
        }
        else if(index==2) {
            return "Hip Hop";
        }
        else if(index==3) {
            return "R&B";
        }
        else if(index==4) {
            return "Bollywood";
        }
        else if(index==5) {
            return "EDM";
        }
        else {
            return "Originals";
        }
    }
  }