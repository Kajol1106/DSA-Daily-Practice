public static HashMap<Integer,Integer> createMap(int[] arr){
    // write your code here
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++) {
        if(map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i])+1);
        }
        else {
            map.put(arr[i], 1);
        }
    }
    return map;
  }
