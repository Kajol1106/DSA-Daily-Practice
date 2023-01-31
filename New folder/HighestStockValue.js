function stockValue(n,arr){
    // write code here
    let max=0;
    let sum=0;
    for(let i=0;i<n;i++){
        
        sum+=arr[i]
        if(sum>max){
            max=sum
        }
    }
    
    console.log(max)
}