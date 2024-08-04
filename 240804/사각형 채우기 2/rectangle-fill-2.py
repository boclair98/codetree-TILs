n = int(input())

dp = [0] *(n+1)
 
dp[1] = 1 
dp[2] = 3
# 3 = 5 
# 4 = 11 
# 5 = 21
# 6 = 43 
# 7 = 85 
for i in range(3,n+1):
    if i % 2 == 1:
        dp[i] = dp[i-1] * 2 - 1
    else:
        dp[i] = dp[i-1] * 2 + 1
print(dp[n])