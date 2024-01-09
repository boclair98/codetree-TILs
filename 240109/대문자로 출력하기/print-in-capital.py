word = input()

for i in word:
    if i>='a' and i<='z':
        print(i.upper(),end='')
    elif i>='A' and i<='Z':
        print(i,end='')