function diamondTraversal(matrix) {
    //Write your code over here
    
    let mid=Math.floor(matrix.length/2);
    
    
    let bag="";
    
    for(let i=mid,j=matrix.length-1;i>=0&&j>=mid;i--,j--){
        bag+=matrix[i][j]+" "
    }
    
    for(let i=1,j=mid-1;i<=mid&&j>=0;i++,j--){
        bag+=matrix[i][j]+" "
    }
    
    for(let i=mid+1,j=1;i<matrix.length&&j<=mid;i++,j++){
        bag+=matrix[i][j]+" "
    }
    
    for(let i=matrix.length-2,j=mid+1;i>=mid+1;i--,j++){
        bag+=matrix[i][j]+" "
    }
    
    console.log(bag)
    
  }
  