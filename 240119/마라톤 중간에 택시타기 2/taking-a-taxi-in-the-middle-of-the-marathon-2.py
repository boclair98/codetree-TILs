import sys
int_min = sys.maxsize
min_value = int_min
n = int(input())

val = []

for i in range(n):

    a , b = map(int,input().split())
    val.append((a,b))


cnt1 = 0 
cnt2 = 0
for i in range(1,n-1):
    cnt1 = abs(val[i][0]-val[0][0])
    cnt2 = abs(val[i][1]-val[0][1])

    cnt3 = abs(val[-1][0] - cnt1) + cnt1
    cnt4 = abs(val[-1][1] - cnt2) + cnt2
    

    min_value = min(min_value,cnt3+cnt4)

print(min_value)