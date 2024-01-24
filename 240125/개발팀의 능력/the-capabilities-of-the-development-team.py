import sys
arr = list(map(int,input().split()))

n = len(arr)

min_val = sys.maxsize

def diff(a,b,c,d):
    sum1 = arr[a] + arr[b]
    sum2 = arr[c] + arr[d]
    sum3 = sum(arr) - sum1 - sum2

    cnc = 3

    if (sum1 != sum2 and sum1!=sum3 and sum2!= sum3):
        min_val = min(sum1,sum2,sum3)
        max_val = max(sum1,sum2,sum3)

        cnc = max_val - min_val
    
    return cnc

for i in range(n):

    for j in range(i+1,n):

        for k in range(n):

            for t in range(k+1,n):

                if i==k or i==t or j==k or j==t:
                    continue
                
                min_val = min(min_val,diff(i,j,k,t))

print(min_val)