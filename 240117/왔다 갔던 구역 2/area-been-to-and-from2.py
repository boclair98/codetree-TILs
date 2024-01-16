n = int(input())

num =[0]*201

max_val = 2
one = 100
cnt = 0 
for i in range(n):

    x,r = map(str,input().split())
    x = int(x)
    tal = int(x)+100

    if r == 'R':

        for i in range(101,tal+1):
            num[i]+=1
    
    elif r == 'L':
        
        for i in range(tal,tal-x,-1):
            num[i]+=1
    
    
for j in range(0,201):
    if num[j]>=max_val:
        cnt+=1

print(cnt)