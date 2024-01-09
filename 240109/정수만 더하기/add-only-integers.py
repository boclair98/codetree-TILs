word = input()
tal = 0 
for i in word:
    if i.isdigit():
        tal+=int(i)
print(tal)