a,b,c = map(int,input().split())
tal = (a*24*60 + b *60 + c) - (11*24*60+11*60+11)
if tal>=0:
    print(tal)
else:
    print(-1)