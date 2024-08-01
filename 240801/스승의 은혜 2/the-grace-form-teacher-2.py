n,b = map(int,input().split())
num= [] 
for i in range(n):
    num.append(int(input()))
tal = [] 
for i in range(n):
    money = 0
    count = 0
    money +=(num[i]//2)
    count+=1 
    for j in range(i+1,n):
        money+=num[j]
        count+=1
        if money >b:
            count-=1
            money-=num[j]
            tal.append((count,money))
            break 
tal.sort(key = lambda x:-x[0])
print(tal[0][0])