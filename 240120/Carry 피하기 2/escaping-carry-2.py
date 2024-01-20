n = int(input())

num = []
ans = - 1
for _ in range(n):
    num.append(int(input()))
tal = 0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            carry = False
            if num[i]%10 + num[j] %10 + num[k] %10 >=10:
                carry = True
            
            if num[i] % 100//10 + num[j] % 100 //10 + num[k] %100//10 >=10:
                carry = True
            
            if num[i] % 1000//100 + num[j] % 1000 //100 + num[k] %1000//100 >=10:
                carry = True
            if num[i] % 10000//1000 + num[j] % 10000 //1000 + num[k] %10000//1000 >=10:
                carry = True
            
            if carry == False:
                ans = max(ans,num[i]+num[k]+num[j])
print(ans)