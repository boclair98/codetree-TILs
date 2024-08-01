n,b = map(int,input().split())
num= [] 
for i in range(n):
    num.append(int(input()))
tal = []
num.sort() 
money = 0 
count = 0
idx = 0 
while money<b:
    money+=num[idx]
    count+=1
    if money < b:
        idx+=1
    else:
        money-=num[idx]
        money+=(num[idx]//2)
        if money >=b:
            break 
print(count-1)