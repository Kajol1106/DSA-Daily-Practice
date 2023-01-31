class instructor_details{
    String name;
    int age;
    String course_name;
    String coding_language;
    
    public instructor_details(String n,int a,String c_n,String c_l){
        this.name=n;
        this.age=a;
        this.course_name=c_n;
        this.coding_language=c_l;
        
    }
    void name() {
        System.out.println(name);
    }
    
    void age(){
        System.out.println(name+" "+age);
    }
    void courseName(){
        System.out.println(name+" "+course_name);
    }
    void codingLanguage(){
        System.out.println(name+" "+coding_language);
    }
    // complete the class as mentioned in the problem statement
  }