n = int(input())
num = [1,2]
for i in range(2,n):
    num.append(num[i-2]+num[i-1])
print(num[n-1]%10007)