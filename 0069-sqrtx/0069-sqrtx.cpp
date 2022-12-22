class Solution {
public:
    int mySqrt(int x) {
        int l = 0 , h = x/2 , m;
        
        // x<4
        if(x == 0 ){
            return 0;
        }else if(x <= 3){
            return 1;
        }
        
        //x >= 4
        while(l<h){
            m=l+(h-l)/2;

            if(m < (x / m) ){
                l=m+1;
            }else{
                h=m;
            }
        }

        return x/h;
    }
};