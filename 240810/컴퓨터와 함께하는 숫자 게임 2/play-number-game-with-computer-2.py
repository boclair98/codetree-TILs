m = int(input())
a,b = map(int,input().split())
num = [i for i in range(1,m+1)]
def binary(x):
    start = 0 
    end = m - 1
    count = 0 
    while start<=end : 
        mid = (start + end ) // 2 
        if num[mid] == x:
            count+=1
            return count 
        elif num[mid] > x:
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