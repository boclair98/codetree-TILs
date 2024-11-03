word = input()
for i in word:
    if i.isdigit():
        print(i,end='')
    elif i.isalpha():
        print(i.lower(),end='')