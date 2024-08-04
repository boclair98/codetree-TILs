n, m = map(int,input().split())
dic = {i:0for i in range(1,n+1)} 
def suc(num,s):
    for x,y in num.items():
        if s == y:
            return x

for i in range(1,n+1):
    s = input()
    dic[i] = s 

for _ in range(m):
    s = input()
    if s.isdigit():
        print(dic[int(s)])
    else:
        dic2= {y:x for x,y in dic.items()}
        print(dic2[s])