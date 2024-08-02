k,n = map(int,input().split())
#1이상 k 이하 n번 반복
tal = []
visited = [False] * (k+1) 
def check(num):
    flag = False 
    for i in range(len(num)-1):
        if num[i] == num[i+1]:
            flag = True 
        else :
            flag = False 
            return flag 
    if flag:
        return True
         
        

def backtracking():
    if len(tal) == n:
        tals = list("".join(map(str,tal)))
        cheching = check(tal)
        if not cheching:
            print(' '.join(map(str,tals)))
        return 
    for i in range(1,k+1):
        tal.append(i)
        backtracking()
        tal.pop()
        
backtracking()