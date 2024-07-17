n = int(input())

tile = [0] *(100000)
now = 100
for _ in range(n):
    s,r = input().split()
    s = int(s)
    if r =='L':
        for i in range(now,now-s,-1):
            tile[i] = 1 
        now = now - s - 1
    else:
        for i in range(now,now+s):
            tile[i] = 2 
        now = now + s -1 

white = tile.count(1)
black = tile.count(2)
print(white,black)