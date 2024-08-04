n, m = map(int,input().split())
dic = [input() for _ in range(n)]
dic2 ={}
for i in range(n):
    dic2[dic[i]] = i + 1
for _ in range(m):
    s = input()
    if s.isdigit():
        print(dic[int(s)-1])
    else:
        print(dic2[s])