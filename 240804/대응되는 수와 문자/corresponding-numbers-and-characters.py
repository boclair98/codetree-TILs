n, m = map(int,input().split())
dic = {i:0for i in range(1,n+1)} 

for i in range(1,n+1):
    s = input()
    dic[i] = s 

for _ in range(m):
    s = input()
    if s.isdigit():
        print(dic[int(s)])
    else:
        for x,y in dic.items():
            if y == s:
                print(x)