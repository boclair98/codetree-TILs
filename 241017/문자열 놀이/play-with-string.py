s,n = input().split()
n = int(n)
s = list(s)

for _ in range(n):
    a,b,c = map(str,input().split())
    if a == '1':
        b = int(b)
        c = int(c)
        temp = s[b-1]
        s[b-1] = s[c-1]
        s[c-1] = temp 
        print("".join(map(str,s)))
    elif a == '2':
        for i in range(len(s)):
            if s[i] ==b:
                s[i] = c
        print("".join(map(str,s)))