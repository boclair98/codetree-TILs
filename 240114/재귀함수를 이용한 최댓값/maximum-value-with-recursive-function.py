n = int(input())

num = list(map(int,input().split()))
max_value = 0 
def max_val(s):
    if s == 0:
        return num[0]
    
    return max(s-1,num[s])
print(max_val(n))