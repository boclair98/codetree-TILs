m1,d1,m2,d2 = map(int,input().split())

word = input()
month = [0,31,29,31,30,31,30,31,31,30,31,30,31]
day =["Mon",'Tue','Wed','Thu','Fri','Sat','Sun']
cnt = 0

def mon(x, y):
    tal = 0

    for i in range(1,x):
        tal+=month[i]
    tal = tal+y
    return tal

diff = mon(m2,d2) - mon(m1,d1)

for i in range(diff):
    if day[i%6] == word:
        cnt+=1


print(cnt)