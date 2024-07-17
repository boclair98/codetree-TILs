n, m = map(int,input().split())
a = [0] *(100000)
b = [0] *(100000)
now = 1000
for _ in range(n):
    r,s = input().split()
    s = int(s)
    if r == 'R':
        for i in range(now,now+s+1):
            a[i] = 1 
        now = now + s + 1

    else:
        for i in range(now,now-s-1,-1):
            a[i] = 1
        now = now -s -1 
flag = True 
num = -199999999
while flag:
    for _ in range(m):
        r,s = input().split()
        s = int(s)
        if r == 'R':
            for i in range(now,now+s+1):
                b[i] = 1
                if a[i] == 1:
                    num = i
                    flag = False
            now = now + s + 1

        else:
            for i in range(now,now-s-1,-1):
                b[i] = 1
                if a[i] == 1:
                    num = i
                    flag = False
            now = now -s -1 

print(num-1000+1)