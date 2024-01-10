word = input()

def alpha(word):
    word = list(set(word))
    if len(word)>1:
        print("Yes")
    else:
        print("No")

alpha(word)