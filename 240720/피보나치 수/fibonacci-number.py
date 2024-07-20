n = int(input())
num = [1,1]

for i in range(3,n+1):
    num[i] = num[i-2] + num[i-1]

print(num[n-1])