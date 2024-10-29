word = input()
alpha = input()
for i in alpha:
    if i == "L":
        word = word[1:] + word[0]
    elif i == "R":
        word = word[-1] + word[0:len(word)-1]
print(word)