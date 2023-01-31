function check(n,arr){
    // start reverse
    //take stack stack is empty .
    //push index of last ele in stack.
    // arr[7]==73 check with 76 is smaller 
    //pop it if it greater push it ie index .
    //to find diff bet cuu day and stack day.
    
    let stack=[];
    let ans=[];
    
    for(let i=n-1;i>=0;i--){
        
        while(stack.length!==0 && 
        arr[stack[stack.length-1]]<=arr[i]){
    // value in st we have to remove whiche 
    //is lesser that crr value
        stack.pop();
    }
    if(stack.length==0){
        ans.push(0);
    }else{
        let temp=stack[stack.length-1];
        temp=temp-i;
        ans.push(temp)
    }
    stack.push(i);
}
ans=ans.reverse();
console.log(ans.join(" "))
    
    
}


function runProgram(input){
    //Input Taking Here
    input=input.split("\n");
    let tc=input[0];
    let line=1;
    for(let i=0;i<tc;i++){
        let n=+input[line];
        line++;
        let arr=input[line].split(" ").map(Number);
        line++;
        
        check(n,arr);
    }
}
if(process.env.USER===""){
    runProgram('');
}else{
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read="";
    process.stdin.on("data",function(input){
        read+=input;
    });
    process.stdin.on("end",function(){
        read=read.replace(/\n$/,"");
        read=read.replace(/\n$/,'');
        runProgram(read);
    });
    process.on('SIGINT',function(){
        read=read.replace(/\n$/,"");
        runProgram(read);
        process.exit(0);
});
}