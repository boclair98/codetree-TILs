m1,d1,m2,d2 = map(int,input().split())

word = input()
month = [0,31,28,31,30,31,30,31,31,30,31,30,31]
day =["Mon",'Tue','Wed','Thu','Fri','Sat','Sun']
cnt = 0
sat_cnt = 0
while True:
    if m1 == m2 and d1 == d2:
        cnt+=1
        if day[cnt%7] == 'Sat':
            sat_cnt += 1
        break
    if day[cnt%7] == 'Sat':
        sat_cnt += 1
    d1 = d1 + 1
    cnt+=1
    if d1>month[m1]:
        m1 = m1 + 1
        d1 = 1
    
    
print(sat_cnt)