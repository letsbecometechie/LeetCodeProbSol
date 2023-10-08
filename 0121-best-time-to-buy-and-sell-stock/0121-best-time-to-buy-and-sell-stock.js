/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    
    let minPro=Number.MAX_VALUE;
    let maxPro=0;
    
    for(let i=0;i<prices.length;i++){
        minPro = Math.min(minPro,prices[i]);
        maxPro = Math.max(maxPro,prices[i]-minPro);
        
    }
    
    
    return maxPro;
    
};