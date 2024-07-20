n = int(input())
num = [1,1]

for i in range(2,n+1):
    num.append(  num[i-2] + num[i-1])

print(num[n-1])