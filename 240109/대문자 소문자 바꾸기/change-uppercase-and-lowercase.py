word = input()

for i in word:
    if i.isupper():
        print(i.lower(),end='')
    elif i.islower():
        print(i.upper(),end='')