h = input()

num = [] 

for i in h:
    if i =='(':
        num.append(i)
    elif i ==')' and len(num)>0:
        if num[-1]=='(':
            num.pop()
    elif i ==')' and len(num) == 0:
        print('No')
        break

if len(num) == 0:
    print('Yes')
else:
    print('No')