public static void solve(List<Integer> list){
    int n = list.size();
    // 4
    if(list.contains(5)){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    // 1
    // System.out.println(n);
    // 2
    Map<Integer,Integer> map1 = new HashMap<>();
    for(int i: list){
        if(map1.containsKey(i)){
            map1.put(i,map1.get(i)+1);
        }else{
             map1.put(i,1);
        }
    }
    int e = 0;
    for(int i: map1.keySet()){
        if(i%2 == 0)
        
        e++;
        
    }
    if(n%2 == 0){
        list.add(10);
    }else{
        list.add(0,10);
    }
    // 3
    if(n>=5){
        list.add(3,3);
    }else{
        list.add(3);
    }
Map<Integer,Integer> map = new HashMap<>();
    for(int i: list){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }else{
             map.put(i,1);
        }
    }
    int o = 0;
  
    for(int i: list){
        if(i%2 == 1)
        
        o++;
        
    }
// 5
     System.out.println(o);
//  6
      System.out.println(o);
    
    int fo = 0;
    int fm = 0;
    for(int i : map.keySet()){
        if(map.get(i)>1){
            fm++;
        }else{
            
        }
        fo++;
    }
    
    // 7
     System.out.println(fo);
//  7
      System.out.println(fm);
    
    
// 9
    System.out.print(list.get(0)+" ");
    System.out.println(list.get(list.size()-1));
    // 10
    for(int i: list){
        System.out.print(i+" ");
}

}
