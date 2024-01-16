a,b,c,d = map(int,input().split())

def num(x,y):
    total = 0
    day =[0,31,28,31,30,31,30,31,31,30,31,30,31]

    for i in range(1,x):
        total +=day[i]
    total +=y

    return total
tot = num(c,d) - num(a,b) +1
print(tot)