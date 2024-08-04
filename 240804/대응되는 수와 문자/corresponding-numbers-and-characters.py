n, m = map(int,input().split())
dic = {i:input() for i in range(1,n+1)} 

for _ in range(m):
    s = input()
    if s.isdigit():
        print(dic[int(s)])
    else:
        idx = 1
        while idx <= n:
            if dic[idx] == s:
                print(idx)
                break
            else:
                idx+=1