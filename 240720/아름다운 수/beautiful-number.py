n = int(input())
cnt = 0 
num = [] 
visited = [False] * (n+1)
total = 0 
def check(number):
    cnt2 = 0
    cnt3 = 0
    cnt4 = 0 
    if number.count('1') == n:
        return True 
    for i in range(len(number)):
        if number[i]=='2':
            if i+1 < len(number):
                for j in range(i+1,i+2):
                    if number[j]=='2':
                        cnt2+=1
                    else:
                        if number[j]=='1':
                            break
                        else:
                            return False
                    
                    
                    
        elif number[i]=='3':
            if i+2<len(number):
                for j in range(i+1,i+3):
                    if number[j]=='3':
                        cnt3+=1
                    else:
                        if number[j]=='1':
                            break
                        else:
                            return False
                    
        elif number[i]=='4':
            if i+3<len(number):
                for j in range(i+1,i+4):
                    if number[j]=='3':
                        cnt4+=1
                    else:
                        if number[j]=='1':
                            break
                        else:
                            return False
    if cnt2 == 1 and cnt3 == 0 and cnt4 == 0:
        return True 
    elif cnt3 == 2 and cnt2 == 0 and cnt4 == 0:
        return True 
    elif cnt4 == 3 and cnt2==0 and cnt3 == 0:
        return True
    elif cnt2== 1 and cnt3==2 and cnt4 == 3:
        return True 
    return False 
    
def backtracking():
    global total
    if len(num) == n :
        number = "".join(map(str,num))
        chk = check(number)
        if chk:
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