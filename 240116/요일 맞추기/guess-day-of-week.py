m1,d1,m2,d2 = map(int,input().split())
day=["Sun","Mon","Tue","Wed","Fri","Sat"]
day1 = [0,31,28,31,30,31,30,31,31,30,31,30,31]
cnt = 1
if m1 >=m2:
    if d2>d1:

        while True:
            if m1 == m2 and d1 == d2:
                break
            d2 = d2 - 1

            cnt = cnt - 1

            if d2<1:
                m1 = m1 - 1
                d2 = day1[m1]
            if cnt<0:
                cnt = 6
    else:
        while True:
            if m1 == m2 and d1 == d2:
                break
            d1 = d1 - 1

            cnt = cnt - 1

            if d1<1:
                m1 = m1 - 1
                d1 = day1[m1]
            if cnt<0:
                cnt = 6
    print(day[cnt])
elif m1<=m2:

    while True:

        if m1 == m2 and d1 == d2:
            break
        
        d1 = d1 + 1
        cnt = cnt+1

        if d1>day1[m1]:
            m1 = m1 +1 
            d1 = 1
        if cnt>6:
            cnt = 0

    print(day[cnt])