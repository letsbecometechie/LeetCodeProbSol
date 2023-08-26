/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    
    let temp =[];
    while(n>0){
        temp.push(n%10);
        n=Math.floor(n/10);
    }
    
    let prod=1,sum=0
    
    for(let i=0;i<temp.length;i++){
        prod*=temp[i];
        sum+=temp[i];
    }
    return prod-sum;
};