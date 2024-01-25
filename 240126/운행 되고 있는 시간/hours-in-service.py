n = int(input())

time = [tuple(map(int,input().split())) for _ in range(n)]
time.sort()
ans = 0 
tal = 0
cnt = 0
for i in range(n):
    x_time = time[i][0]
    y_time = time[i][1]

    for j ,(x,y) in enumerate(time):

        if i == j :
            continue

        if y_time < time[j][0]:

            cnt = y_time - x_time + time[j][1] - time[j][0]
        tal = max(tal,cnt)
    ans = max(ans , tal)  
print(ans)