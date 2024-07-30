n = int(input())
cnt = 0 
num = [] 
visited = [False] * (n+1)
total = 0 
    
def check(number):
    idx = 0
    while idx < n:
        if idx + int(number[idx]) -1 >=n:
            return False 
        for j in range(idx,idx+int(number[idx])):
            if number[idx] != number[j]:
                return False 
        idx+=int(number[idx])
    return True
            

def backtracking():
    global total
    if len(num) == n :
        number = list("".join(map(str,num)))
        checks = check(number)
        if checks:
            total+=1
        return 

    for i in range(1,5):
        visited[i] = True 
        num.append(i)
        backtracking()
        num.pop()
        visited[i]=False 
backtracking()

print(total)