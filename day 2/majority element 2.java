class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
       vector<int>a;
       int sum1 = 0, sum2 = 0, count1 = 0, count2 = 0;
       for(auto n: nums){
           if(sum1 == n) 
               count1++;
           else if(sum2 == n)
               count2++;
           else if(count1 == 0){
               sum1 = n;
               count1 = 1;
           }
           else if(count2 == 0){
               sum2 = n;
               count2 = 1;
           }
           else{
               count1--;
               count2--;
           }
       }
       count1 = 0;
       count2 = 0;
       for(auto n: nums)
           if(sum1 == n)
               count1++;
           else if(sum2 == n)
               count2++;
       if(count1 > nums.size()/3)
           a.push_back(sum1);
       if(count2 > nums.size()/3)
           a.push_back(sum2);
       return a;
    }
};
