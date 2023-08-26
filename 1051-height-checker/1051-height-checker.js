/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    
    let expected = [...heights].sort((a,b)=>a-b);
    
    console.log(expected);
    
    let result = expected.reduce((acc,curr,index)=>{
        expected[index] !== heights[index] ? acc++ :acc;
        return acc;
    },0);
    
    return result;
    
};