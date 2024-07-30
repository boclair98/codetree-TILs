n = int(input())
cnt = 0 
num = [] 
visited = [False] * (n+1)
total = 0 
    
def check(number):
    idx = 0
    su = 0 
    fail = 0  
    while idx < n:
        if number[idx] =='1':
            su+=1
            idx+=1

        elif number[idx]=='2' :
            if idx == n-1:
                fail+=1
                break
            if number[(idx+1)%n]=='2':
                su+=1
                idx+=2
            else:
                fail+=1
                idx+=1 

        elif number[idx]=='3' :
            if idx == n-2 or idx==n-1:
                fail+=1
                break
            if number[(idx+1)%n]=='3' and number[(idx+2)%n]=='3':
                su+=1
                idx+=3
            else:
                fail+=1
                idx+=1

        elif number[idx]=='4':
            if idx == n-3:
                fail+=1
                break
            if number[(idx+1)%n] =='4' and number[(idx+2)%n]=='4' and number[(idx+3)%n]=='4':
                su+=1
                idx+=4
            else:
                idx+=1
                fail+=1
    if su>0 and fail == 0:
        return True
    return False

def backtracking():
    global total
    if len(num) == n :
        number = "".join(map(str,num))
        checks = check(number)
        if checks:
            
            total+=1
        return 

    for i in range(1,n+1):
        visited[i] = True 
        num.append(i)
        backtracking()
        num.pop()
        visited[i]=False 
backtracking()

print(total)