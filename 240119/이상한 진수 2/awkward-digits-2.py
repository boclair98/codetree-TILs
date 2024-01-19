import sys 
int_min = -sys.maxsize

num = list(map(int,list(input())))

ans = int_min

for i in range(len(num)):

    num[i] = 1 - num[i]

    tal = 0 

    for j in range(len(num)):

        tal = tal * 2+num[j]
    
    ans = max(ans,tal)

    num[i] = 1 - num[i]

print(ans)