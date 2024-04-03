class Solution {
    public int[] solution(int[] numbers) {
        int[] mul_list = new int[numbers.length];
        
       for(int i = 0 ; i < numbers.length; i++){
           mul_list[i] = numbers[i] * 2;
       }
        return mul_list;
    }
}