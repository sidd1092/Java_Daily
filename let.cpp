class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        map<int,int> mp;
        int ans = 0;
        if(trust.size()==1){
            return trust[0].back();
        }

        vector<int> v = trust[0];
        mp[v[0]] = v.back();

        for(int i=1;i<n;i++){
            if(mp.find(trust[i].back()) != mp.end()){
                ans = trust[i].back();
            }
            else{
                ans = -1;
            }

        }

        return ans;
        
        
    }
};