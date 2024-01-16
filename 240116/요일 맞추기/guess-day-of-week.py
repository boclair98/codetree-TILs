m1, d1 , m2, d2 = map(int,input().split())
day=["Mon","Tue","Wed","Thu","Fri","Sat","Sun"]
mon = [0,31,28,31,30,31,30,31,31,30,31,30,31]

def weather(x,y):
    tal = 0 
    for i in range(1,x):
        tal+=mon[i]
    tal+=y
    return tal

diff = weather(m2,d2) - weather(m1,d1)

if diff<0:
    while True:
        if diff >=0:
            break
        diff+=7
    print(day[diff-1])
else:
    print(day[diff-1])