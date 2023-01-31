//Enter code here
function side(N,arr){
    let stack=[];
    let j=1;
 for(let i=0;i<N;i++){
     stack.push(arr[i])
     while(stack.length>0&&stack[stack.length-1]==j){
          
         stack.pop();
         j++
         
     }
 
     
 }
 
//  for(let i=0;i<=stack.length;i++){
//      ans.push(stack.pop());
//  }
 
//  for(let i=0;i<ans.length;i++){
//      if(ans[i]>ans[i+1]){
//          console.log('no');
//          return
//      }
//  }
if(stack.length==0){
       console.log("yes")
}else{
    console.log("no")
}
 
  
  
    
}
 function runProgram(input){
     //Input Taking Here
     input=input.trim().split('\n');
     
     let line=0;
    
     
     while(true){
         let N=+input[line++];
       
         if(N==0){
             break;
         }
           let arr=input[line++].trim().split(' ').map(Number);
         side(N,arr)
         
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
         runProgramm(read);
         process.et(0);
     });
 }
