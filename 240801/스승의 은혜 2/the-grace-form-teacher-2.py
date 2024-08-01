n,b = map(int,input().split())
num= [] 
for i in range(n):
    num.append(int(input()))
tal = []
num.sort() 
money = 0 
count = 0
idx = 0
chance = True   
while money<b:
    money+=num[idx]
    count+=1
    if money < b:
        idx+=1
    else:
        money-=num[idx]
        if chance:
            money+=(num[idx]//2)
            chance = False 
            if money ==b:
                break 
            elif money > b:
                count-=1
        else:
            count-=1
            break

print(count)