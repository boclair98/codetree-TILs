n = int(input())
coin = [list(map(int,input().split())) for _ in range(n)]
s_idx = 0 
s_idy = 0 
total = 0 
def tot_coin(row,col,row3,col3):
    tot = 0 
    for i in range(row,row3):
        for j in range(col,col3):
            if coin[i][j] == 1:
                tot+=1 
    return tot 


for row in range(n-2):
    for col in range(n-2):
        total = max(total,tot_coin(row,col,row+3,col+3))
print(total)