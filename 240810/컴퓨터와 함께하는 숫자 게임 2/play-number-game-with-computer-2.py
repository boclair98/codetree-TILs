m = int(input())
a,b = map(int,input().split())
num = []

def binary(x):
    start = 1
    end = m 
    count = 0 
    while start<=end : 
        mid = (start + end ) // 2 
        if mid == x:
            count+=1
            return count 
        elif mid > x:
            end = mid - 1
            count+=1
        else:
            start = mid + 1 
            count+=1
    return count 

total = [] 
for i in range(a,b+1):
    total.append(binary(i))
print(min(total),max(total))