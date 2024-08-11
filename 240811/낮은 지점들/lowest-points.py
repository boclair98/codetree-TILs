n = int(input())
gal = [] 
for _ in range(n):
    x,y = map(int,input().split())
    gal.append((x,y))
gal.sort(key = lambda x:x[1])
dic = {}
total = 0  
for i in gal:
    x1,y1 = i 
    if x1 not in dic:
        dic[x1] = 1
        total+=y1 
    else:
        continue
print(total)