h = input()

num = [] 

for i in h:
    if i =='(':
        num.append(i)
    elif i ==')':
        if num[-1]=='(':
            num.pop()

if len(num) == 0:
    print('Yes')
else:
    print('No')