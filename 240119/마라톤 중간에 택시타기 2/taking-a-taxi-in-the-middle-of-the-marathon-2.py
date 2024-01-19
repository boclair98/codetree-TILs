import sys
int_min = sys.maxsize
min_value = int_min
n = int(input())

val = []

for i in range(n):

    a , b = map(int,input().split())
    if a <0:
        a = -a
    if b<0:
        b = -b
    val.append([a,b])



for i in range(1,n-1):
    dist = 0 
    pre_idx = 0



    for j in range(n):
        if i == j :
            continue
        
        dist+= abs(val[pre_idx][0] - val[j][0]) + abs(val[pre_idx][1]-val[j][1])

        pre_idx = j
    
    min_value = min(min_value,dist)
print(min_value)