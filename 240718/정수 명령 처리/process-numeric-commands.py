n = int(input())

num = [] 

for _ in range(n):
    sr = input().split()
    
    if sr[0] =='push':
        num.append(sr[1])
    elif sr[0] =='pop':
        print(num.pop())
    elif sr[0] =='size':
        print(len(num))
    
    elif sr[0]=='empty':
        if len(num) == 0:
            print(1)
        else:
            print(0)
    elif sr[0] =='top':
        print(num[-1])