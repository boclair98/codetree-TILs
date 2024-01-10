y , m ,d = map(int,input().split())

def yun (y):
    if y>=0 and y<=3000:
        if y % 4!=0:
            return False
        elif y %100 != 0:
            return True
        elif  y%400 !=0 :
            return False
        else:
            return True
    else:
        return False


def day(y,m):
    if m==2:
        if (yun(y)):
            return 29
        else:
            return 28

    if  m ==4 or m==6 or m==9 or m==11:
        return 30

    return 31


def day2(y,m,d):

    if y>=1 and y<=3000:
        if 3<=m<=5 and d<=day(y,m):
            return "Spring"
        if (m==12 or m<=2) and d<=day(y,m):
            return "Winter"
        if (9<=m<=11)  and d<=day(y,m):
            return "Fall"
        if(6<=m<=8) and d<=day(y,m):
            return "Summer"

if(day2(y,m,d)):
    print(day2(y,m,d))
else:
    print(-1)