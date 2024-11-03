word = input()
total = 0 

for i in word:
    if i.isdigit():
        total+=int(i);
print(total)