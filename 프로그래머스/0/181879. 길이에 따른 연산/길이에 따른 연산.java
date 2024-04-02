class Solution {
    public int solution(int[] num_list) {
        
        if ( num_list.length >= 11 ){
            int total = 0;
            for (int i = 0 ; i < num_list.length ; i++){
                total += num_list[i];
            }    
            return total;
        }else{
            int mul = 1;
            for (int i = 0 ; i < num_list.length ; i++){
                mul *= num_list[i];
            }    
            return mul;
        } 
    
    }
}