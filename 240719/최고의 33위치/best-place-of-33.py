n = int(input())
coin = [list(map(int,input().split())) for _ in range(n)]
s_idx = 0 
s_idy = 0 
e_idx = n - 3 
e_idy = n - 3
max_cnt = 0 
while True : 
    if e_idx <= s_idx and e_idy <= s_idy:
        break
    cnt = 0  
    for i in range(s_idx,s_idx+3):
        for j in range(s_idy,s_idy+3):
            if coin[i][j] == 1:
                cnt+=1 
    max_cnt = max(max_cnt,cnt)
    s_idx+=1
    s_idy+=1
print(max_cnt)