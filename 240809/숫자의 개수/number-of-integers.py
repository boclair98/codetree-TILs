n,m = map(int,input().split())
num = list(map(int,input().split()))
dic ={}
for i in num:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i]+=1 

def binary(k):
    start = 0
    end = n-1 
    while start<=end:
        mid = (start+end)//2
        if num[mid] == k:
            return True 
        elif num[mid] < k:
            start = mid + 1
        else:
            end = mid - 1
    return False 
    
for _ in range(m):
    s = int(input())
    if binary(s):
        print(dic[s])
    else:
        print(0)