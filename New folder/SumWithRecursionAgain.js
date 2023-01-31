//Enter code here
//Enter code here
//Enter code here
//Enter code here
function RunningSumofanArray(N,arr){

    let s=0;
    
    for(let i=0;i<N-1;i++){
        
        let sum=Math.abs(arr[i]-arr[i+1]);
        s=s+sum;
        //console.log(sum)
    }
     console.log(s)  
  }
 
 
 
 
   function runProgram(input){
      //Input Taking Here
        input=input.trim().split('\n');
      tc=+input[0];
      line=1;
      for(k=0;k<tc;k++){
     let  N=+input[line]
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
  Overview
  Announcements
  Problems
  Submissions
  Rankings
 