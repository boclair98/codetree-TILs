n, m = map(int,input().split())
dic = {i:input() for i in range(1,n+1)} 


for _ in range(m):
    s = input()
    if s.isdigit():
        print(dic[int(s)])
    else:
        dic2= {y:x for x,y in dic.items()}
        print(dic2[s])