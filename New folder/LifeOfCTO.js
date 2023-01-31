//Enter code here
function   fun(N,arr){
    
    let start=0;
    let end=N-1;
let ans=-1;
    while(start<=end){
        let mid= start-Math.floor(((start-end)/2))
        if(arr[mid]==1){
            ans=mid;
            end=mid-1;
        } 
        else{
            start=mid+1
        }
    } console.log(ans);
    
  }
 
  function runProgram(input){
     //Input Taking Here
     input=input.trim().split('\n');
     let N=+input[0]; 
     let arr=input[1].trim().split(' ').map(Number);
    
         fun(N,arr)
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
         runProgramm(read);
         process.et(0);
     });
 }