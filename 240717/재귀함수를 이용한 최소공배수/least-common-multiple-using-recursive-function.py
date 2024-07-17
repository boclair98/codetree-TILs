def lcm(a,b):
    if a < b:
        if b % a == 0:
            return b 
        else:
            return b * a
    elif a > b:
        if a % b == 0:
            return a 
        else:
            return a * b
    else:
        return b
 
n = int(input())
num = list(map(int,input().split()))
tal = []
init = 0
nums = lcm(num[0],num[1])
for i in range(2,n-1):
    tal.append(lcm(nums,num[i]))
    nums = lcm(tal[-1],num[i+1])  
print(tal[-1])