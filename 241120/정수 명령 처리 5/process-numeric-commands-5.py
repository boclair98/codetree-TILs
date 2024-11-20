stack = [] 
n = int(input())
for _ in range(n):
    se = input().split()

    if se[0] =="push_back":
        stack.append(se[1])
    elif se[0]=='get':
        print(stack[(int(se[1])-1)])
    elif se[0] =='pop_back':
        stack.pop()
    else:
        print(len(stack))