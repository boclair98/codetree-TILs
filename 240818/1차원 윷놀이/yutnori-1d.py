n,m,k = map(int,input().split())
num = list(map(int,input().split()))
people = [1 for _ in range(k)]

def calc():
    score = 0 
    for i in people:
        score+= (i>=m) 
    return score 
ans = 0 
def back(cnt):
    global ans 
    ans = max(ans,calc())

    if cnt == n:
        return 
    
    for i in range(k):
        if people[i]>=m:
            continue
        
        people[i]+=num[cnt]
        back(cnt+1)
        people[i]-=num[cnt]

back(0)
print(ans)