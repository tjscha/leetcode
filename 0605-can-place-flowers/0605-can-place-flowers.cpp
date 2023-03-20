class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        
        long long numOnes = 0;
        
        if(n == 0){
            return true;
        }
        if(flowerbed.size()==1){
            if(flowerbed[0] == 1){
                return false;
            }else{
                return true;
            }
        }
        
        for (long long i = 0; i<flowerbed.size(); ++i){
            
            if(i==0){
                if(flowerbed[i] == 0 && flowerbed[(i+1)] == 0){
                    flowerbed[i] = 1;
                    numOnes++;
                }
            }else if(i==(flowerbed.size()-1)){
                if(flowerbed[i] == 0 && flowerbed[(i-1)] == 0){
                    flowerbed[i] = 1;
                    numOnes++;
                }
            }else if(flowerbed[i] == 0 && flowerbed[(i-1)] == 0 && flowerbed[(i+1)] == 0 ){
                numOnes++;
                flowerbed[i] = 1;
            }
        }
        
        if(numOnes<n){
            return false;
        }else{
            return true;
        }
    }
};