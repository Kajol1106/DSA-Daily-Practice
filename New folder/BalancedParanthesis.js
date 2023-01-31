//Enter code here
function  reverse(str){
    let stack=[];
     
     for(let i=0;i<str.length-1;i++){
         
         
          
             
               if(stack[stack.length-1]=='('&&str[i]==')'||stack[stack.length-1]=='{'&&str[i]=='}'||stack[stack.length-1]=='['&&str[i]==']'){
                 stack.pop()
             }else{
                 stack.push(str[i])
             }
             
         
     }
     
     if(stack.length==1){
         console.log('balanced')
     }else{
         console.log('not balanced')
     }
     
     
    }
     function runProgram(input){
         //Input Taking Here
        input=input.trim().split("\n");
        let tc=+input[0];
        let l=1;
        while(tc--!=0){
            let str=input[l++].trim();
             reverse(str)
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
    