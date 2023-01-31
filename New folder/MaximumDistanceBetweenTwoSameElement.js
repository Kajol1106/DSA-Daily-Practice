function RunningSumofanArray(N,arr){
      
    let obj={};
    let max=0;
    for(let i=0;i<N;i++){
        
        if(obj[arr[i]]!=undefined){
            let diff=i-obj[arr[i]];
            if(max<diff){
                max=diff;
            }
        }
        else{
            obj[arr[i]]=i;
        }
        
    }
    
    console.log(max)



}




function runProgram(input){
   //Input Taking Here
     input=input.trim().split('\n');
   tc=+input[0];
   line=1;
   for(k=0;k<tc;k++){
       N=input[line];
       line++;
       arr=input[line].trim().split(' ').map(Number);
       line++;
       RunningSumofanArray(N,arr)
   }}











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
       runProgramm(read);
       process.et(0);
   });
}

