/*
interface unitMovement{
    public String nextCourse(String current_course);
    public boolean nextCourse(int current_course_marks);
    public String nextCourse(int current_course_marks, String current_course);
    public boolean terminated(int current_course_marks, boolean async);
}
*/
class java_unit_movement implements unitMovement{
    // complete this class which implements the interface mentioned above
    public String nextCourse(String current_course) {
        if(current_course.equals("JA111")) {
            return "SB101";
        }
        else if(current_course.equals("SB101")) {
            return "SB201";
        }
        else if(current_course.equals("SB201")) {
            return "RJ101";
        }
        else if(current_course.equals("RJ101")) {
            return "Placements";
        }
        else {
            return null;
        }
    }
    
     public boolean nextCourse(int current_course_marks) {
         if(current_course_marks>=5) {
             return true;
         }
         return false;
     }
     
     public String nextCourse(int current_course_marks,String current_course) {
         if(current_course.equals("JA111")) {
             if(current_course_marks>=5) {
                 return "SB101";
             }
             else {
                 return "JA111";
             }
         }
         
         else if(current_course.equals("SB101")) {
             if(current_course_marks>=5) {
                 return "SB201";
             }
             else {
                 return "SB101";
             }
         }
         
         if(current_course.equals("SB201")) {
             if(current_course_marks>=5) {
                 return "RJ101";
             }
             else {
                 return "SB201";
             }
         }
         
         if(current_course.equals("RJ101")) {
             if(current_course_marks>=5) {
                 return "Placements";
             }
             else {
                 return "RJ101";
             }
         }
         
         return null;
     }
     
     public boolean terminated(int current_course_marks, boolean async) {
         if(async==false) {
             return false;
         }
         else {
             if(current_course_marks>=5) {
                 return false;
             }
             else {
                 return true;
             }
         }
     }
  }
  