a,b = map(str,input().split())
print(ord(a)+ord(b),end=" ")

if a>b:
    print(ord(a)-ord(b))
else:
    print(ord(b)-ord(a))