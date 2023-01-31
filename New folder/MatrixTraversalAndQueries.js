function masaiTraversalAndQueries(N, M, q, arr){
    //write code here
    
    if(q==1){
        
        let bag="";
        
        for(let i=0;i<N;i++){
            
            if(i%2==0){
                for(let j=0;j<M;j++){
                    bag+=arr[i][j]+" "
                }
            }else{
                for(let j=M-1;j>=0;j--){
                    bag+=arr[i][j]+" "
                }
            }
        }
        console.log(bag)
        
    }else{
        
          let bag="";
        
        for(let i=0;i<N;i++){
            
            if(i%2==0){
                for(let j=M-1;j>=0;j--){
                    bag+=arr[i][j]+" "
                }
            }else{
                for(let j=0;j<M;j++){
                    bag+=arr[i][j]+" "
                }
            }
        }
        
        console.log(bag)
    }
  
}
 
