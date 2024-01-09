word = input() 

for i in word:
    if i>='a' and i<='z':
        print(i,end='')
    elif i>='A' and i<='Z':
        print(i.lower(),end='')
    elif i.isdigit():
        print(i,end='')