a,b,c, = map(str,input().split())
a = int(a)
c = int(c)

if b =="*":
    print(f"{a} * {c} = {a*c}")
elif b =="+":
    print(f"{a} + {c} = {a+c}")
elif b =="-":
    print(f"{a} - {c} = {a-c}")
elif b =="/":
    print(f"{a} / {c} = {a//c}")
else:
    print("False")